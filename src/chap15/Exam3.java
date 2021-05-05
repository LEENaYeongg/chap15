package chap15;

import java.util.Random;
import java.util.TreeSet;

/* TreeSet예제
 * Lotto 번호(1~45)의 임의의 숫자를 중복없이 6개를 찾아서 출력하기
 * TreeSet 이용.
 * */
public class Exam3 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		Random ball = new Random();
		ball.setSeed(System.currentTimeMillis());
		while (lotto.size() < 6) {
			lotto.add(ball.nextInt(45) + 1);
		}
		System.out.println(lotto);
	}
}
