package ru.stqa.pft.sandbox;

import java.sql.SQLInvalidAuthorizationSpecException;

public class MyFirstProgram {

	public static void main(String[] args) {	
		hello("world");
		hello("Olesya");
		hello("user");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 5);
		System.out.println("Расстояние мужду точками p1(" + p1.x + "," + p1.y + ") и p2(" + p2.x + "," + p2.y + ") = " + p2.distance(p1));

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

//	public static double distance(Point p1, Point p2){
//		return Math.sqrt((((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y))));
//	}
}