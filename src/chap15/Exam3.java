package chap15;

import java.util.Random;
import java.util.TreeSet;

/* TreeSet����
 * Lotto ��ȣ(1~45)�� ������ ���ڸ� �ߺ����� 6���� ã�Ƽ� ����ϱ�
 * TreeSet �̿�.
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
