package com.practice.algorithm;

import java.util.List;
import java.util.Optional;

public class LinearSearch {

    public Optional<Integer> find(List<Integer> list, int number) {
        return list.stream().filter(n -> n == number).findFirst();
    }
}
