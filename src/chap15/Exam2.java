package chap15;

import java.util.HashSet;
import java.util.Set;

/* Student Ŭ���� �����ϱ�
 * 1. ������� : �л�(Studno), �̸�(name), ����(major)
 * 2. ����޼��� : �л� ������ ����ϵ��� toString �������̵� �ϱ�
 * 3. �й��� �̸��� ���� ��� ���� �л����� �ν��ϵ��� �ϱ�.
 * 		=> �й��� �̸��� ���� ��� �ߺ��� �л����� �ν�
 * 4. ���� Ŭ������ �µ��� ������ ����. */
class Student {
	String studno;
	String name;
	String major;

	Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}

	public String toString() {
		return "�й�=" + studno + ", �̸�=" + name + ", ����=" + major;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) { //obj(��������) ��ü�� student ��ü��? ��� ����� ��
			Student s = (Student) obj;//(Student)�ǹ� : ����ȯ
			return studno.equals(s.studno) && name.equals(s.name);
		} else return false; //return false�� ���� : student ��ü�� �ƴϸ� ���� �� ���� ������.
	}
	@Override
	public int hashCode() {
		return studno.hashCode() + name.hashCode(); //��ü�� �ߺ� ���� �Ǵ� 
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("1234", "ȫ�浿", "�濵"));
		set.add(new Student("2345", "ȫ���", "�濵"));
		set.add(new Student("2345", "ȫ���", "�İ�"));
		set.add(new Student("1234", "ȫ�浿", "���"));
		set.add(new Student("4567", "ȫ�浿", "�濵"));
		System.out.println("��� �л� �� :" + set.size());
		System.out.println("����л�:");
		for (Student s : set)
			System.out.println(s);
	}
}
