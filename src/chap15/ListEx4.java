package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Shape implements Comparable<Shape> {
//Shape 은 추상 클래스기 때문에 
	int x, y;

	Shape() {
		this(0, 0);
	}

	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract double area();

	abstract double length();

	public String toString() {
		return "x: " + x + ", y: " + y;
	}

	@Override // 참조변수와 상관없이 그 객체의 마지막 오버라이딩이 그대로 다시 구현
	public int compareTo(Shape o) {
		return (int) (area() - o.area());
	}
}

/*
 * Circle class - Shape의 하위 클래스 멤버: double r 생성자: 반지름 입력 받아 객체 생성 없을 경우 1로 생성
 * 넓이, 둘레 구하는 메소드
 * 
 * Rectangle class - Shape의 하위 클래스 멤버: int w, h 생성자: 가로, 세로 입력 받아 객체 생성(없을 경우
 * (1,1)) 넓이, 둘레 구하는 메소드
 */

class Circle extends Shape {
	double r;

	Circle() {
		this(1);
	}

	Circle(double r) {
		this.r = r;
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	double length() {
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() {
		return "(" + super.toString() + ") 반지름: " + r + ", 면적: " + area() + ", 둘레: " + length();
	}
}

class Rectangle extends Shape {
	double w, h;

	Rectangle() {
		this(1, 1);
	}

	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		return w * h;
	}

	@Override
	double length() {
		return 2 * (w + h);
	}

	@Override
	public String toString() {
		return "(" + super.toString() + ") 가로: " + w + ", 세로: " + h + ", 면적: " + area() + ", 둘레: " + length();
	}
}

public class ListEx4 {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();

		list.add(new Circle(5));
		list.add(new Rectangle(3, 4));
		list.add(new Circle());
		list.add(new Circle(10));
		list.add(new Rectangle());

		for (Shape s : list) {
			System.out.println(s);
		}
		System.out.println("면적이 넓은 순으로 정렬하기");
		Collections.sort(list,Comparator.reverseOrder()); //sort 오류 해결: Shape클래스에 implements Comparable<Shape>
		for (Shape s : list) {
			System.out.println(s);
		}
		System.out.println("둘레 역순으로 정렬하기");
//		Collections.sort(list,new Comparator<Shape>(){ //new Comparator : inner 클래스=> 이름없는 내부 클래스
//			@Override 
//			public int compare(Shape s1, Shape s2) {
//				return (int)(s2.length()-s1.length()); 
//			}
//		});
		//람다방식으로 코딩
		Collections.sort(list,(s1,s2)->(int)(s2.length() - s1.length()));
		for (Shape s : list) {
			System.out.println(s);
		}
	}
}