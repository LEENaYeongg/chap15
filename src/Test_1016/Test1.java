package Test_1016;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


/* 1.  1 ~ 99까지의 정수를 입력받아서 TreeSet에 저장하고, 0 을 입력하면 입력을 종료한다. 
      입력된 값을 정렬하여 출력하기.
   1 ~ 99 까지의 숫자가 아닌 경우 TreeSet에서 저장하지 말것.
   set1 오름차순 정렬되도록 출력.
   set2 내림차순 정렬되도록 출력하기.

[결과]
1부터 99까지의 숫자를 입력하세요 (종료 : 0)
1 2 5 9 1 100 12 3 2 5 64 123 4 5 0
set1:[1, 2, 3, 4, 5, 9, 12, 64]
set2:[64, 12, 9, 5, 4, 3, 2, 1]

​*/
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeSet<Integer> nums = new TreeSet<>();
		System.out.println("1~99 값을 입력하세요.(종료: 0)");
		
		while(true) {
			int num = scan.nextInt();
			nums.add(num);
			
			if(num<1 || num>99) {
				nums.remove(num);
				if(num ==0){
					System.out.println("프로그램이 종료됐습니다~");
				
					break;
					}
			}
		}
		System.out.println("set1:"+nums);
		TreeSet<Integer> set2 = new TreeSet<>(Comparator.reverseOrder());
		set2.addAll(nums);
		System.out.println("set2:"+set2);
	}
}
