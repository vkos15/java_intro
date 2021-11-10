package ru.vkost;

import com.codeborne.selenide.Selenide;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {


    int[] intArray2 = new int[]{1,2,3,5,6};
    String[] stringArray;
    String[] stringArray2 = new String[]{"foo","bar"};

    public static void main(String[] args) {

        int[] intArray = new int[5];
        int[] intArray4 = {1, 2, 3, 4, 5};
        intArray[0]=1;
        intArray[1]=2;
        for (int i = 4; i >=0 ; i--) {
            intArray[i]=i+1;
        }


        for (int element:intArray){
            System.out.println(element);
        }
        System.out.println(Arrays.toString(intArray));

        List<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.remove(0);
        stringList.remove("foo");

        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.remove(2);
        intList.remove(Integer.valueOf(10));




    }
}
