package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integers = new HashSet<>();
        for (Integer nums : sourceList) {
            if (nums % 2 == 0) {
                while (nums % 2 == 0) {
                    integers.add(nums);
                    nums = nums / 2;
                }
                integers.add(nums);
            } else {
                integers.add(nums);
                integers.add(nums * 2);
            }
        }
        return integers;
    }
}
