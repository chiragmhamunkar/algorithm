package com.practice.algorithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LinearSearchTest {
    LinearSearch linearSearch;

    @Before
    public void setUp(){
        this.linearSearch = new LinearSearch();
    }

    @Test
    public void test_numberFound(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> numberOptional = linearSearch.find(list, 3);
        Assert.assertTrue(numberOptional.isPresent());
    }

    @Test
    public void test_numberNotFound(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> numberOptional = linearSearch.find(list, 6);
        Assert.assertFalse(numberOptional.isPresent());
    }

}
