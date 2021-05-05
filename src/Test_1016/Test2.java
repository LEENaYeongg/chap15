package Test_1016;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/*1. Student 클래스 구현하기
멤버변수 : 이름,국어점수, 영어점수, 수학점수
멤버메서드 
	String toString() : 각멤버변수값,총점,평균 출력
	int getTotal() : 점수의 합 리턴
	int compareTo() : 이름 오름차순으로 정렬되도록 구현
2. main 메서드 완성하기*/
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
		return "이름:"+name +" 국어점수:"+ kor +" 영어점수:"+eng+" 수학점수:"+math+" 총점:"+getTotal()+" 평균:"+getTotal()/3; 
	}
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}
public class Test2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 90, 80, 70));
		list.add(new Student("김삿갓", 95, 85, 75));
		list.add(new Student("이몽룡", 80, 95, 95));
		list.add(new Student("임꺽정", 60, 75, 100));
		System.out.println("기본정렬방식");
		TreeSet<Student> set1 = new TreeSet<>();
		set1.addAll(list);
		for (Student s : set1)
			System.out.println(s);
		System.out.println("총점기준 내림차순 정렬");
		TreeSet<Student> set2 = new TreeSet<>((p1,p2)->p2.getTotal() - p1.getTotal());
		set2.addAll(list);
		for (Student s : set2)
			System.out.println(s);
		System.out.println("국어 점수내림차순 정렬");
		TreeSet<Student> set3 = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.kor-o1.kor;
			}
		});
		set3.addAll(list);
		for (Student s : set3)
			System.out.println(s);
		System.out.println("영어 점수내림차순 정렬");
		TreeSet<Student> set4 = new TreeSet<>((p1,p2)->p2.eng - p1.eng);
		set4.addAll(list);
		for (Student s : set4)
			System.out.println(s);
		System.out.println("수학 점수내림차순 정렬");
		TreeSet<Student> set5 = new TreeSet<>((p1,p2)->p2.math - p1.math);
		set5.addAll(list);
		for (Student s : set5)
			System.out.println(s);
	}
}
