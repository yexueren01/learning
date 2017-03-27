package com.twogrit.learning.com.twogrit.learning.enumt;

import com.twogrit.learning.enumt.Enum1;
import com.twogrit.learning.enumt.Enum2;
import com.twogrit.learning.enumt.EnumSelect;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/1/11.
 */
public class EnumSelectTest {
    @Test
    public void test() {
        Enum1 e1 = EnumSelect.kOf(Enum1.values(), "aa");
        assertThat(e1, equalTo(Enum1.AA));


        Enum2 e2 = EnumSelect.kOf(Enum2.values(), "cc");
        assertThat(e2, equalTo(Enum2.CC));
    }
}
