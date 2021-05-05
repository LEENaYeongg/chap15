package chap15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* 사용자가 정의한 클래스의 객체를 TreeSet에 저장하기
 * 정렬관련 인터페이스
 * 1. Comparable<T> 인터페이스
 * 		int CompareTo(T) : 객체의 기본 정렬방식 지정.
 * 2. Comparator<T> 인터페이ㅡ
 * 		int compare(T,T) : 동적 실행시 정렬방식 변경할 수 있는 기능.
 *  */

/*ClassCastException : 에러*/
class PhoneNo implements Comparable<PhoneNo> {
	String name;
	int number;

	public PhoneNo(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String toString() {
		return name + ":" + number;
	}

	@Override
	public int compareTo(PhoneNo o) {
		return name.compareTo(o.name); // 이것의 결과가 양수면 내가 앞이다, 뒤면 내가 음수다.
	}
}

public class SetEx4 {
	public static void main(String[] args) {
		List<PhoneNo> list = new ArrayList<>();
		list.add(new PhoneNo("홍길동", 0101234));
		list.add(new PhoneNo("김삿갓", 022345));
		list.add(new PhoneNo("이몽룡", 7890));

		System.out.println("이름 순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set = new TreeSet<>(list);
		System.out.println(set);
		System.out.println("이름 역순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set2 = new TreeSet<>(Comparator.reverseOrder());
		set2.addAll(list);
		System.out.println(set2);
		
		System.out.println("전화번호 순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set3 = new TreeSet<>(new Comparator<PhoneNo>() {

			@Override //전화번호 순으로 정렬할 때
			public int compare(PhoneNo p1, PhoneNo p2) {
				return p1.number - p2.number;
			}
		});
		set3.addAll(list); //list 객체를 set 객체에 저장
		System.out.println(set3);
		
		System.out.println("전화번호 역순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set4 = new TreeSet<>(new Comparator<PhoneNo>() {

			@Override 
			public int compare(PhoneNo p1, PhoneNo p2) {
				return p2.number - p1.number; //음수면 p1이 앞.
			}
		});
		set4.addAll(list); 
		System.out.println(set4);
		
		//람다방식으로 처리
		System.out.println("전화번호 역순으로 정렬하여 출력하기");
		TreeSet<PhoneNo> set5 = new TreeSet<>((p1,p2)->p2.number - p1.number); 
		set5.addAll(list); 
		System.out.println(set5);
	}
}
