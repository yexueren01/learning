package com.twogrit.learning.guava.throwables;

import com.google.common.base.Throwables;
import com.twogrit.learning.design_pattern.mvc.one.BeatModel;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by kezhang on 17/3/8.
 */
public class ThrowablesTest {

    @Test
    public void test() {
        try {
            ExModel beatModel = new ExModel();
            beatModel.getName().equals("aa");
        } catch (NullPointerException ne) {
            throw Throwables.propagate(ne);

        }
    }

    @Test
    public void testThrowsIfNullPointerException() {
        try {
            ExModel beatModel = new ExModel();
            beatModel.getName().equals("aa");
        } catch (RuntimeException ne) {
            Throwables.propagateIfInstanceOf(ne, NullPointerException.class);
        }
    }


    @Test
    public void testCastToRunTimeException() {

        ExModel beatModel = new ExModel();
        try {
            beatModel.getDisplayName().equals("aa");
        } catch (ExecutionException e) {
            Throwables.propagate(e);
        }

    }

    @Test
    public void test1() {
        ExModel beatModel = new ExModel();
        try {
            beatModel.getDisplayName().equals("aa");
        } catch (ExecutionException e) {
            throw new RuntimeException(Throwables.getRootCause(e));
        }

    }

    @Test
    public void testnewR() {
        ExModel beatModel = new ExModel();
        try {
            beatModel.getDisplayName().equals("aa");
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }


}
