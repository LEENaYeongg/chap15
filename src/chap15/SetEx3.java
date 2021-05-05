package chap15;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet ���� : ���ĵ�.
 * Set �������̽��� ���� �������̽� Sortedset ����Ŭ���� */
public class SetEx3 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
//		Set<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("from:"+from+", to:"+to);
		System.out.println(set.subSet(from,to)); //subSet�� Set�� ����� �ƴ�. SortedSet�� ���.subSet�� ���Ŀ��� ����� �� �ִ�.
		System.out.println("from:"+from+", to:"+to+"zzzz");
		System.out.println(set.subSet(from,to+"zzzz"));
//jdk8.0 ���� : �������� �����ϱ�
		System.out.println("�������� �����Ͽ� ����ϱ�.");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("��ҹ��� ���о��� �����Ͽ� ����ϱ�");
		class IgnoreCase implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		}
		set = new TreeSet<>(new IgnoreCase());
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car1");set.add("Car2"); //car, Car�� ���� ���ڷ� ���� ������ �ѹ��� ����Ѵ�.
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
	}
}
