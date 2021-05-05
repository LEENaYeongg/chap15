package Test_1015;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*1. ���� ����� �������� ���α׷��� �ۼ��Ͻÿ�

1 ~ 1000�������� ��ȣ�� ������ ������ �ִ�.
1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�
�� ��÷�� 3����� ��÷�ϰ�, ��÷��ȣ�� �ߺ��Ǹ� �ȵȴ�.
��÷�� ��ȣ�� ������ ���̹Ƿ� ���� ���� ���� �Ҷ� ���� �ٸ���.

LinkedHashSet : ��������, �ߺ��Ұ� // �ڿ��� set ���� ������ set�̱���~, ÷�� ��� �Ұ�
Random
new ArrayList(Set) : Set ��ü�� List��ü�� ����


[���]
3�� ���� ��÷�մϴ�.
945
123
6
2�� ���� ��÷�մϴ�.
611
404
1�� ���� ��÷�մϴ�.
797

*** ���� ��÷ ��� ***

1��:797,
2��:404,611,
3��:6,123,945, 
 * 
 * */
public class Test1 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while (set.size() <= 6) {
			if(set.size() ==0)
				System.out.println("3�� ����");
			else if(set.size() == 3) 
				System.out.println("2�� ����");
				else if(set.size() == 5)
				System.out.println("1�� ����");
				int num = rand.nextInt(1000) +1;
				if(set.add(num)) 
					System.out.println(num);
				}
	}
}
