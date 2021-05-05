package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map 인터페이스 : (key, 객체)쌍으로 객체를 모아서 저장하는 객체.*/

public class MapEx1 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" }; //key 값 ==> 유일해야함. 중복X
		int[] nums = { 1234, 4567, 2350, 9870, 3456 }; //객체(value)값
		//<String, Integer> : key : String 자료형 설정.
		//					  value : Integer 자료형 설정.
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]); //map.put = list의 add와 같은 역할.
			//=> 5번째 김삿갓 값이 이미 있으므로 오류나는 것이 아니라 4567을 3456으로 값 수정.
		}
		System.out.println(map);
		System.out.println("김삿갓의 전화번호 :"+map.get("김삿갓")); //키에 해당하는 값을 출력.
		System.out.println("김삿갓의 전화번호 :"+map.get("홍길동"));
		System.out.println("김삿갓의 전화번호 :"+map.get("성춘향")); //없으므로 null
		
		//map key들만 조회
		Set<String> keys = map.keySet(); //Set : 중복안됨. key들은 중복될 수 없기 때문에 Set의 형태로 keys에는 key 값들만 들어가있음.
		for(String k : keys) 
			System.out.println(k + "=" + map.get(k));
		//map value들만 조회
		Collection<Integer> values = map.values(); //중복안된다는 보장X 순서는 key값을 따라감. 객체들만 모아둠.
		/* Collection 타입으로 한 이유 : 
		 * List는 순서있는 데이터들의 집합 이므로 List타입은 안되고, Set은  중복이 안되기에 Set타입도 안되고 객체들만 모아뒀기 때문에 Collection타입으로*/
		for(Integer v : values) 
			System.out.println(v);
		//map (key,value) 쌍인 객체들을 조회
		Set<Map.Entry<String, Integer>> entry = map.entrySet();// 키와 값 쌍을 출력
		for(Map.Entry<String, Integer> m : entry) { //map 객체에 데이터를 집어넣는 메서드: put
			System.out.println(m);
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		//key가 홍길동인 객체 제거하기
		Integer value = map.remove("홍길동");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map의 요소의 갯수:" + map.size());
	}
}
