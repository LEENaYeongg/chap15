package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Shape implements Comparable<Shape> {
//Shape �� �߻� Ŭ������ ������ 
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

	@Override // ���������� ������� �� ��ü�� ������ �������̵��� �״�� �ٽ� ����
	public int compareTo(Shape o) {
		return (int) (area() - o.area());
	}
}

/*
 * Circle class - Shape�� ���� Ŭ���� ���: double r ������: ������ �Է� �޾� ��ü ���� ���� ��� 1�� ����
 * ����, �ѷ� ���ϴ� �޼ҵ�
 * 
 * Rectangle class - Shape�� ���� Ŭ���� ���: int w, h ������: ����, ���� �Է� �޾� ��ü ����(���� ���
 * (1,1)) ����, �ѷ� ���ϴ� �޼ҵ�
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
		return "(" + super.toString() + ") ������: " + r + ", ����: " + area() + ", �ѷ�: " + length();
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
		return "(" + super.toString() + ") ����: " + w + ", ����: " + h + ", ����: " + area() + ", �ѷ�: " + length();
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
		System.out.println("������ ���� ������ �����ϱ�");
		Collections.sort(list,Comparator.reverseOrder()); //sort ���� �ذ�: ShapeŬ������ implements Comparable<Shape>
		for (Shape s : list) {
			System.out.println(s);
		}
		System.out.println("�ѷ� �������� �����ϱ�");
//		Collections.sort(list,new Comparator<Shape>(){ //new Comparator : inner Ŭ����=> �̸����� ���� Ŭ����
//			@Override 
//			public int compare(Shape s1, Shape s2) {
//				return (int)(s2.length()-s1.length()); 
//			}
//		});
		//���ٹ������ �ڵ�
		Collections.sort(list,(s1,s2)->(int)(s2.length() - s1.length()));
		for (Shape s : list) {
			System.out.println(s);
		}
	}
}