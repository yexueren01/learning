package com.twogrit.learning.ninetynine_problems;

import java.util.List;
import java.util.NoSuchElementException;

public class P02 {
    public static Integer secondLast(List<Integer> numbers) {
        if(numbers.size()<2){
            throw new NoSuchElementException();
        }
        return numbers.get(numbers.size()-2);
    }
}
