package ru.vkost.homework;

import java.util.*;

public class ArraysCollectionsPractice {


    public static void main(String[] args) {
        int[] numbers = {1, 2, -16};

        String[] someStrings = {"33", "hello", "erer", "qwe"};
        Arrays.sort(numbers);
        //Arrays.sort(someStrings); - сортировка в порядке возрастания
        Arrays.sort(someStrings, Collections.reverseOrder());
        System.out.println("отсортированный массив чисел " + Arrays.toString(numbers));
        System.out.println("отсортированный в обратном порядке массив строк " + Arrays.toString(someStrings));


        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("qa");
        list.add("guru");

        System.out.println("размер списка: " + list.size());
        //разные варианты, как можно вывести список
        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.forEach(System.out::println);

        //HashSet
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("abc");
        hashSet.add("def");
        hashSet.add("jk");
        System.out.println("hashSet:");

        for (String text : hashSet)
        {
            System.out.println(text);
        }

        System.out.println("treeSet:");
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("y");
        treeSet.add("x");
        treeSet.add("z");

        for (String text : treeSet)
        {
            System.out.println(text);
        }

        //maps
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "apple");
        map.put("2", "cheese");
        map.put("3", "juice");
        map.replace("2","banana");
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }

    }




}
