package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (Integer nums : sourceList) {
            navigableSet.add((int) Math.pow(nums, 2));
        }
        return navigableSet.subSet(lowerBound, true, upperBound, true);
    }
}
