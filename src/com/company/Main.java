package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        speedTestAddInBeginningAndEndForArrayAndLinkedList(arrayList, linkedList);
        /*Добавление в конец в ArrayList происходит быстрее, чем в LinkedList, потомучто в ArrayList
         * значение добавляется в ячейку как в массиве, а в LinkedList создается нода,
         * в предыдущую ноду записывается адрес новой ноды и в только тогда в новую ноду записывается значение.
         * Добавление в начало в ArrayList происходит медленнее, чем в LinkedList, потому что в ArrayList
         * при добавлении в начало все последующие элементы сдвигаются вправо и только тогда значение вставляется в ячейку,
         * а в LinkedList создается нода, в нее записывается ссылка на первую ноду, новая нода становится первой
         * и записывается значение. */

        checkSpeedByContainsForSet(hashSet, treeSet);
        /*treeSet быстрее, чем hashSet из-за того, чо в основе treeSet находится сбалансированное дерево*/

        CheckSpeedContains(arrayList, linkedList, hashSet);

        /* ???*/

    }

    private static void CheckSpeedContains(List<Integer> arrayList, List<Integer> linkedList, Set<Integer> hashSet) {
        System.out.println("Check speed by .contains() for ArrayList " + TestUtil.testContainsInList(arrayList));
        System.out.println("Check speed by .contains() for LinkedList " + TestUtil.testContainsInList(linkedList));
        System.out.println("Check speed by .contains() for hashSet " + TestUtil.testContainsInSet(hashSet));
    }

    private static void checkSpeedByContainsForSet(Set<Integer> hashSet, Set<Integer> treeSet) {
        TestUtil.testAddToCollectionInEnd(hashSet);
        TestUtil.testAddToCollectionInEnd(treeSet);
        System.out.println("Check speed by .contains() for hashSet " + TestUtil.testContainsInSet(hashSet));
        System.out.println("Check speed by .contains() for treeSet " + TestUtil.testContainsInSet(hashSet));
    }

    private static void speedTestAddInBeginningAndEndForArrayAndLinkedList(List<Integer> arrayList, List<Integer> linkedList) {
        System.out.println("Test add in the end for arrayList " + TestUtil.testAddToCollectionInEnd(arrayList));
        System.out.println("Test add in the end for linkedList " + TestUtil.testAddToCollectionInEnd(linkedList));
        System.out.println("Test add in the beginning for arrayList " + TestUtil.testAddToCollectionInBeginning(arrayList));
        System.out.println("Test add in the beginning for linkedList " + TestUtil.testAddToCollectionInBeginning(linkedList));
    }
}
