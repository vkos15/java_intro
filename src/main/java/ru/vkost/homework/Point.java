package ru.vkost.homework;


import java.util.Arrays;
import java.util.Comparator;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point[] points = new Point[4];

        points[0] = new Point(5, 2);
        points[1] = new Point(3, 4);
        points[2] = new Point(4, 5);
        points[3] = new Point(5, 6);

        Comparator<Point> byX = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.x - p2.x;
            }
        };

        Comparator<Point> byY = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.y - p2.y;
            }
        };


        Arrays.sort(points, byX);
        System.out.println("Сортировка byX: " + Arrays.toString(points));
        Arrays.sort(points, byY);
        System.out.println("Сортировка byY: " + Arrays.toString(points));


    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }

}
