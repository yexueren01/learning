package com.twogrit.learning.mockito;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class SpyTest {
    List<String> spyList = spy(new ArrayList<String>());

    @Test
    public void doReturnShouldNotRealDoMethod() {
        doReturn("NotRealDoMethod").when(spyList).get(100);
        String realValue = spyList.get(100);
        assertThat(realValue, equalTo("NotRealDoMethod"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void doReturnShouldNotRealDoMethod0() {
        when(spyList.get(100)).thenReturn(("realDoMethod so throw IndexOutOfBoundsException"));
        String realValue = spyList.get(100);
    }

}
