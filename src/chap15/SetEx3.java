package chap15;

import java.util.Comparator;
import java.util.TreeSet;

/* TreeSet 예제 : 정렬됨.
 * Set 인터페이스의 하위 인터페이스 Sortedset 구현클래스 */
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
		System.out.println(set.subSet(from,to)); //subSet은 Set의 멤버가 아님. SortedSet의 멤버.subSet은 정렬에서 끌어올 수 있다.
		System.out.println("from:"+from+", to:"+to+"zzzz");
		System.out.println(set.subSet(from,to+"zzzz"));
//jdk8.0 이후 : 역순으로 정렬하기
		System.out.println("역순으로 정렬하여 출력하기.");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("대소문자 구분없이 정렬하여 출력하기");
		class IgnoreCase implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		}
		set = new TreeSet<>(new IgnoreCase());
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car1");set.add("Car2"); //car, Car은 같은 문자로 보기 때문에 한번만 출력한다.
		set.add("disc");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");
		set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
	}
}
