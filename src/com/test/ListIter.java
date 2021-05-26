package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIter {
    public static void main(String[] args) {
        String s = "KADAK";
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> listIterator2 = list.listIterator(list.size());
        boolean isEqual = true;
        while (listIterator.hasNext() && listIterator2.hasPrevious()) {
            if (listIterator.next() != listIterator2.previous()) {
                isEqual = false;
                break;
            }
        }
        System.out.println(isEqual);

    }
}
