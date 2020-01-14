package ru.stqa.qa_java.sandbox;

import org.testng.Assert;

public class PointClass {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 10);
        double dist12 = Point.distance(p1, p2);
        double dist13 = Point.distance(p1, p3);
        double dist23 = Point.distance(p2, p3);


        System.out.println("Расстояние между точками (" + p1.toString() + ") и (" + p2.toString() + ") = " + dist12);
        Assert.assertEquals(dist12,5.0);
        System.out.println("Расстояние между точками (" + p1.toString() + ") и (" + p3.toString() + ") = " + dist13);
        Assert.assertEquals(dist13,11.0);
        System.out.println("Расстояние между точками (" + p2.toString() + ") и (" + p3.toString() + ") = " + dist23);
        Assert.assertEquals(dist23,6.0);
    }

}