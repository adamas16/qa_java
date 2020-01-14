package ru.stqa.qa_java.sandbox;

public class Point {

    public double x1;
    public double y1;

    public Point() {
        this.x1 = 0;
        this.y1 = 0;
    }

    public Point(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }


    public static double distance(Point p1, Point p2) {

        double d = Math.round(Math.sqrt((p2.x1 - p1.x1) * (p2.x1 - p1.x1) + (p2.y1 - p1.y1) * (p2.y1 - p1.y1)));
        return d;

    }


    @Override
    public String toString() {

        return this.x1 + ";" + this.y1;

    }


}