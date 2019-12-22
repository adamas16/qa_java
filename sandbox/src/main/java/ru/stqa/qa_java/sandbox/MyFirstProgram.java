package ru.stqa.qa_java.sandbox;

public class MyFirstProgram{

	public static void main (String[] args){
		hello("people");
		hello("world");
		hello("me");
		//System.out.println("Hello, world!");
		double l = 156;
		System.out.println("Площадь квадрата со стороной " + l + " =" + area(l));
		double a = 151;
		double b = 435;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и "+ b + " =" + area(a,b));
	}

	public static void hello (String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (double len){
		return len * len;
	}

	public static double area (double a, double b){
		return a * b;
	}

}