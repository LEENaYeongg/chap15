package chap15;

import java.util.HashSet;
import java.util.Set;
/* 객체의 중복 여부 판단
 * 1. equals   : 결과 true
 * 2. hashCode : 결과값이 같은 경우
 * => 1,2 모두 만족하는 경우 중복된 객체로 판단
 * 
 * equals 메서드 오버라이딩시 hashCode() 메서드 오버라이딩 하도록 권장.
 * */
class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "(" + name + "," + age +")";
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		}else return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String ("abc"));
		set.add(new String ("abc")); //abc는 중복으로 봐서 한번만 출력하는데
//		set.add(new Person ("홍길동",10)); 
//		set.add(new Person ("홍길동",10));
		//Person은 같은 값인데 중복으로 안봄. 이유 : 객 체
//		Person p = new Person("홍길동",10);
//		set.add(p);set.add(p);
//		set.add(p);set.add(p);
		set.add(new Person ("홍길동",10));
		set.add(new Person ("홍길동",10));
		set.add(new Person ("홍길동",20));
		set.add(new Person ("홍길동",10));
		System.out.println(set);

	}
}
