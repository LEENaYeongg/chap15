package chap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* 1. 대한민국=서울, 캐나다=오타와, 영국=런던을 HashMap에 저장하고,
 * 	    화면에서 나라이름을 입력받아 해당 나라의 수도를 출력하는 프로그램 구현하기
 * 		만약 등록된 나라가 아닌 경우 등록된 나라가 아닙니다. 메시지 출력하기.
 * 2. 종료 문자가 입력되면, 현재 등록된 나라 =수도 정보 출력하고 프로그램 종료하기
 * 3. 등록된 나라가 아닌 경우 입력된 나라의 수도를 입력받아 Map 에 등록하기.
 * */
public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// String cname = scan.nextLine();
		String[] nation = { "대한민국", "캐나다", "영국" };
		String[] capital = { "서울", "오타와", "런던" };
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < nation.length; i++) {
			map.put(nation[i], capital[i]);
		}
		while (true) {
			System.out.println("나라를 입력하세요(종료:종료)");
			String nation1 = scan.next();
			if (nation1.equals("종료"))
				break;
			if (map.get(nation1) == null)
				System.out.println("등록된나라가 아닙니다");
			else
				System.out.println(nation1 + "의 수도는" + map.get(nation1) + "입니다");

		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println(map);
		Set<Map.Entry<String, String>> entry = map.entrySet();
		for (Map.Entry<String, String> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey() + "=" + m.getValue());
		}
		System.out.println();

	}

}