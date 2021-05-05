package chap15;

import java.util.ArrayList;
import java.util.List;

/*List 예제
 * List 인터페이스 : Collection 인터페이스의 하위 인터페이스
 * 				 객체들을 저장할 때 순서를 유지.
 * 				 첨자 사용이 가능함.
 * 구현클래스 : ArrayList, Vector, LinkedList 등이 있다.
 * */
public class ListEx1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //==> thread 에 대해서 unsafe
//		List<Integer> list = new Vector<Integer>(); ==> thread 에 대해서 safe
//		List<Integer> list = new LinkedList<Integer>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
		list.add(0);
		System.out.println(list);
		for(int i =0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		// jdk8.0 이후에 같은 자료형인 경우 <> 표시로 가능
		List<Integer> list2 = new ArrayList<>(list.subList(1,4));
		System.out.println(list2);
		for(Integer i : list) { //개선된 for 구문으로 출력하기
			System.out.println(i);
		}
	}

}
