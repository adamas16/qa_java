package ru.stqa.qa_java.sandbox;

public class Point{

    public static double x1, y1, x2, y2;

    public static void main (String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x1 = -4;
        p1.y1 = 10;
        p2.x2 = 0;
        p2.y2 = 13;

        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + distance(p1,p2));

    }

    public static double distance(Point p1, Point p2){

        return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1)*(p2.y2 - p1.y1));

    }
    
}