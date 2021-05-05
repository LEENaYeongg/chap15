package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map �������̽� : (key, ��ü)������ ��ü�� ��Ƽ� �����ϴ� ��ü.*/

public class MapEx1 {
	public static void main(String[] args) {
		String[] names = { "ȫ�浿", "���", "�̸���", "�Ӳ���", "���" }; //key �� ==> �����ؾ���. �ߺ�X
		int[] nums = { 1234, 4567, 2350, 9870, 3456 }; //��ü(value)��
		//<String, Integer> : key : String �ڷ��� ����.
		//					  value : Integer �ڷ��� ����.
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]); //map.put = list�� add�� ���� ����.
			//=> 5��° ��� ���� �̹� �����Ƿ� �������� ���� �ƴ϶� 4567�� 3456���� �� ����.
		}
		System.out.println(map);
		System.out.println("����� ��ȭ��ȣ :"+map.get("���")); //Ű�� �ش��ϴ� ���� ���.
		System.out.println("����� ��ȭ��ȣ :"+map.get("ȫ�浿"));
		System.out.println("����� ��ȭ��ȣ :"+map.get("������")); //�����Ƿ� null
		
		//map key�鸸 ��ȸ
		Set<String> keys = map.keySet(); //Set : �ߺ��ȵ�. key���� �ߺ��� �� ���� ������ Set�� ���·� keys���� key ���鸸 ������.
		for(String k : keys) 
			System.out.println(k + "=" + map.get(k));
		//map value�鸸 ��ȸ
		Collection<Integer> values = map.values(); //�ߺ��ȵȴٴ� ����X ������ key���� ����. ��ü�鸸 ��Ƶ�.
		/* Collection Ÿ������ �� ���� : 
		 * List�� �����ִ� �����͵��� ���� �̹Ƿ� ListŸ���� �ȵǰ�, Set��  �ߺ��� �ȵǱ⿡ SetŸ�Ե� �ȵǰ� ��ü�鸸 ��Ƶױ� ������ CollectionŸ������*/
		for(Integer v : values) 
			System.out.println(v);
		//map (key,value) ���� ��ü���� ��ȸ
		Set<Map.Entry<String, Integer>> entry = map.entrySet();// Ű�� �� ���� ���
		for(Map.Entry<String, Integer> m : entry) { //map ��ü�� �����͸� ����ִ� �޼���: put
			System.out.println(m);
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		//key�� ȫ�浿�� ��ü �����ϱ�
		Integer value = map.remove("ȫ�浿");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map�� ����� ����:" + map.size());
	}
}
