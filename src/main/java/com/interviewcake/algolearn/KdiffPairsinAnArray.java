package com.interviewcake.algolearn;

import java.util.HashSet;
import java.util.Set;

public class KdiffPairsinAnArray {

    public int getNumberOfPairs(int[] array, int k) {
        if (k < 0) return 0;
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> found = new HashSet<>();
        for (int n : array) {
            if (numbers.contains(n + k)) found.add(n);
            if (numbers.contains(n - k)) found.add(n - k);
            numbers.add(n);
        }
        return found.size();
    }
}
