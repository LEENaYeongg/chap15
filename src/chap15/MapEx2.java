package chap15;

import java.util.TreeMap;

/* TreeMap ���� : key������ ���� */

public class MapEx2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores=new TreeMap<>();
		scores.put(87, "ȫ�浿"); scores.put(98, "�̸���");
		scores.put(75, "�Ӳ���"); scores.put(94, "���");
		scores.put(80, "������"); scores.put(88, "�����");
		System.out.println(scores);
		System.out.println("ù��° key :" + scores.firstKey());
		System.out.println("ù��° entry :" + scores.firstEntry());
		System.out.println("ù��° entry key :" + scores.firstEntry().getKey());
		System.out.println("ù��° entry value :" + scores.firstEntry().getValue());
		System.out.println("������ entry :" + scores.lastEntry());
		System.out.println("95�� �Ʒ� ���� :");
		System.out.println(scores.lowerEntry(95));
		System.out.println("95�� �� ���� :");
		System.out.println(scores.higherEntry(95));
		System.out.println("95�� �Ʒ� ���� 95�� ���� :");
		System.out.println(scores.floorEntry(94));
		System.out.println("95�� �� ���� 95�� ���� :");
		System.out.println(scores.ceilingEntry(95));
	}
}