package chap15;

import java.util.List;
import java.util.Vector;

/* Vector 예제 : Collection 프레임워크 이전 클래스
 * 				List 인터페이스의 구현 클래스
 * 				이전 사용된 메서드와 List를 구현한 메서드가 함께 존재 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>(); 
		//double 로 쓰면 에러 ==> Collection 은 기본자료형으로 놓을 수 없다.
//		List<Double> list = new Vector<>();
		list.add(0.3); //0.3은 기본자료형이지만 들어갈 수 있는 이유 : 자동형변환(Boxing) 
		//Boxing : 기본자료형 객체가 double로 바뀌는것.
		list.add(Math.PI);
		list.addElement(5.0); // Vector의 원래 메서드. add() 같은 기능 // addElement는 list의 멤버가 아니다. //int형은 안되서 5는 에러
		for (Double d : list) {
			System.out.println(d);
		}
		double num = 5.0;
		//list 객체에서 num 객체의 위치 리턴
		int index = list.indexOf(num);
		//contains : list의 내부에 num 객체 존재? (true/false)
		if (index < 0)
			System.out.println(num + "은 list에 없습니다.");
		else
			System.out.println(num + "의 위치: " + index);

		num = 0.3;
		System.out.println(list.indexOf(num));
		if (list.contains(num)) {
			list.removeElement(num);
			System.out.println(num + "삭제됨");
		}
		list.remove(5.0);
		System.out.println(list);
		System.out.println(list.get(0)+","+list.size()); //첨자는 항상 유동적으로 왔다갔다함. 유동적
	}
}
