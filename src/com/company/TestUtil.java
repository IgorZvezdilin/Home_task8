package com.company;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class TestUtil {

    public static final int ITERATIONS_COUNT = 10000000;
    public static final int ITERATIONS_COUNT_FOR_CONTAINS = 1000000000;
    public static final int ITERATIONS_COUNT_FOR_ADD_IN_BEGINNING = 100000;

    public static long testAddToCollectionInEnd(Collection<Integer> collection){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< ITERATIONS_COUNT; i++){
            collection.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public static long testAddToCollectionInBeginning(List<Integer> collection){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< ITERATIONS_COUNT_FOR_ADD_IN_BEGINNING; i++){
            collection.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public static long testContainsInSet(Set<Integer> collection){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< ITERATIONS_COUNT_FOR_CONTAINS; i++){
            collection.contains(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public static long testContainsInList(List<Integer> collection){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< ITERATIONS_COUNT_FOR_CONTAINS; i++){
            collection.contains(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
}
