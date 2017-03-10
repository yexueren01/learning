package com.twogrit.learning.guava.concurrent;

import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import com.google.common.util.concurrent.FutureCallback;

import java.io.File;
import java.io.IOException;

/**
 * Created by kezhang on 17/3/10.
 */
public class JarUpdateCreatedFutureCallback implements FutureCallback<String> {
    JarUpdateParams jarUpdateParams;

    public JarUpdateCreatedFutureCallback(JarUpdateParams jarUpdateParams) {
        this.jarUpdateParams = jarUpdateParams;
    }

    @Override
    public void onSuccess(String result) {

        String str="jarUpdateParams.getName()["+jarUpdateParams.getName()+"] Callback get listenable future's result with callback " + result;

        File file = new File("./doc/JarUpdateCreatedFutureCallback.txt");
        try {
            Files.asByteSink(file, FileWriteMode.APPEND).write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(str);
    }

    @Override
    public void onFailure(Throwable t) {
        t.printStackTrace();
    }


}
