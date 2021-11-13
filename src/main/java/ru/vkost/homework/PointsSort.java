package ru.vkost.homework;

import java.util.Arrays;
import java.util.Comparator;

import static ru.vkost.homework.Point.byX;
import static ru.vkost.homework.Point.byY;

public class PointsSort {

    public static void main(String[] args) {

        Point[] points = new Point[4];

        points[0] = new Point(5, 2);
        points[1] = new Point(3, 4);
        points[2] = new Point(4, 5);
        points[3] = new Point(5, 6);
        Arrays.sort(points, byX);
        System.out.println("Сортировка byX: " + Arrays.toString(points));
        Arrays.sort(points, byY);
        System.out.println("Сортировка byY: " + Arrays.toString(points));
    }

}
