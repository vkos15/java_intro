package ru.vkost.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysCollectionsPractice {



    public static void main(String[] args) {
        int[] numbers = {1, 2, -16};

        String[] someStrings = {"33", "hello","erer", "qwe"};
        Arrays.sort(numbers);
        //Arrays.sort(someStrings);
        Arrays.sort(someStrings, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(someStrings));


        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");




    }

    // System.out.println(Arrays.toString(numbers));



}
