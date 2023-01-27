package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        for (String values : firstSet) {
            if (secondSet.contains(values)) {
                resultSet.add(values);
            }
        }
        for (String values : thirdSet) {
            if (!firstSet.contains(values) && !secondSet.contains(values)) {
                resultSet.add(values);
            }
        }
        return resultSet;
    }
}
