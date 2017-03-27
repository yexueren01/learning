package com.twogrit.learning.guava.preconditions;

import org.junit.Test;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kezhang on 17/3/8.
 * checkArgument(boolean)	检查boolean是否为true，用来检查传递给方法的参数。	IllegalArgumentException
 * checkNotNull(T)	检查value是否为null，该方法直接返回value，因此可以内嵌使用checkNotNull。	NullPointerException
 * checkState(boolean)	用来检查对象的某些状态。	IllegalStateException
 * checkElementIndex(int index, int size)	检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size *	IndexOutOfBoundsException
 * checkPositionIndex(int index, int size)	检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size *	IndexOutOfBoundsException
 * checkPositionIndexes(int start, int end, int size)	检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效*	IndexOutOfBoundsException
 */
public class PreconditionsTest {

    @Test(expected = NullPointerException.class)
    public void test() {
        checkNotNull(null, "id can not null");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArg() {
        checkArgument(100 < 1, "id can not null");
    }
}
