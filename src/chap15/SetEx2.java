package chap15;

import java.util.HashSet;
import java.util.Set;
/* ��ü�� �ߺ� ���� �Ǵ�
 * 1. equals   : ��� true
 * 2. hashCode : ������� ���� ���
 * => 1,2 ��� �����ϴ� ��� �ߺ��� ��ü�� �Ǵ�
 * 
 * equals �޼��� �������̵��� hashCode() �޼��� �������̵� �ϵ��� ����.
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
		set.add(new String ("abc")); //abc�� �ߺ����� ���� �ѹ��� ����ϴµ�
//		set.add(new Person ("ȫ�浿",10)); 
//		set.add(new Person ("ȫ�浿",10));
		//Person�� ���� ���ε� �ߺ����� �Ⱥ�. ���� : �� ü
//		Person p = new Person("ȫ�浿",10);
//		set.add(p);set.add(p);
//		set.add(p);set.add(p);
		set.add(new Person ("ȫ�浿",10));
		set.add(new Person ("ȫ�浿",10));
		set.add(new Person ("ȫ�浿",20));
		set.add(new Person ("ȫ�浿",10));
		System.out.println(set);

	}
}
