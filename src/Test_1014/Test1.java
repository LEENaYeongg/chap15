package Test_1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 1. 화면에서 여러개의 자연수를 입력받아 이들 중 홀수 인 자연수들을 모두 골라 그합을 구하고, 
		홀수중 최대값과 최소값을 찾는 프로그램을 작성하기(홀수 들로만 이루어진 List 객체를 생성하여 출력하기)

7개의 자연수 : 12 77 38 41 53 92 85 인 경우
77 41 53 85 만 홀수 이므로
77+41+53+85 = 합 
홀 수의 최대값 : 85
홀 수의 최소값 : 41
입력된 홀수 : [77,41,53,85]

 * */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("여러개의 자연수를 입력하세요(종료:999)");
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			int num = scan.nextInt();
			if (num == 999)
				break;
			if(num%2 == 1) {
			list.add(num);
			sum += num;
			}
		}
		System.out.println("합 =" + sum);
		Collections.sort(list);
		System.out.println("입력데이터의 최댓값 : " +list.get(list.size()-1));//최댓값
		System.out.println("입력데이터의 최솟값 : " + list.get(0)); //최솟값
		System.out.println("입력된 홀수: " + list);
	}
}
