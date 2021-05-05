package Test_1016;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/*1. Student Ŭ���� �����ϱ�
������� : �̸�,��������, ��������, ��������
����޼��� 
	String toString() : �����������,����,��� ���
	int getTotal() : ������ �� ����
	int compareTo() : �̸� ������������ ���ĵǵ��� ����
2. main �޼��� �ϼ��ϱ�*/
class Student implements Comparable<Student>{
	String name;
	int kor,eng,math;
	
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return kor+eng+math;
	}
	public String toString() {
		return "�̸�:"+name +" ��������:"+ kor +" ��������:"+eng+" ��������:"+math+" ����:"+getTotal()+" ���:"+getTotal()/3; 
	}
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}
public class Test2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ȫ�浿", 90, 80, 70));
		list.add(new Student("���", 95, 85, 75));
		list.add(new Student("�̸���", 80, 95, 95));
		list.add(new Student("�Ӳ���", 60, 75, 100));
		System.out.println("�⺻���Ĺ��");
		TreeSet<Student> set1 = new TreeSet<>();
		set1.addAll(list);
		for (Student s : set1)
			System.out.println(s);
		System.out.println("�������� �������� ����");
		TreeSet<Student> set2 = new TreeSet<>((p1,p2)->p2.getTotal() - p1.getTotal());
		set2.addAll(list);
		for (Student s : set2)
			System.out.println(s);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set3 = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.kor-o1.kor;
			}
		});
		set3.addAll(list);
		for (Student s : set3)
			System.out.println(s);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set4 = new TreeSet<>((p1,p2)->p2.eng - p1.eng);
		set4.addAll(list);
		for (Student s : set4)
			System.out.println(s);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set5 = new TreeSet<>((p1,p2)->p2.math - p1.math);
		set5.addAll(list);
		for (Student s : set5)
			System.out.println(s);
	}
}
