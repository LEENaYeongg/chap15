package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * SutdaCard 클래스 구현하기
 * 멤버 변수 : int num,boolean isKwang;
 * 생성자 :멤버값들을 입력받아 객체 생성
 *      매개변수가 없는 경우 num, true인 객체 생성
 * 멤버 메서드 : toString()오버라이딩
 *           1K,1,2...
 */
class SutdaCard {
	int number;
	boolean isKwang;

	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}

	SutdaCard() {
		this(1, true);
	}

	@Override
	public String toString() {
		return number + ((isKwang) ? "K" : "");
	}
}

/*
 * SutdaDeck 클래스 멤버변수 : List<SutdaCard> cards; 
 * static Map<String,Integer> jokbo;
 * 생성자 : 매개변수 없음 SutdaCard 20장을 cards List객체에 저장 
 * 1~10의 숫자를 가진 카드가 각각 2장씩 숫자값이
 * 1,3,8인 카드 중 한장은 isKwqng이 true임 
 * 메서드 : SutdaCard pick() 첫번째 카드를 제거하여 리턴 void
 * shuffle() cards 섞어주는 기능. 
 * Collections.shuffle메서드 이용
 * 
 */
class SutdaDeck {
	List<SutdaCard> cards;
	static Map<String, Integer> jokbo;
	static {// static 초기화블럭-static멤버의 초기화를 담당
		jokbo = new HashMap<>();// 객체 만들기
		jokbo.put("KK", 4000);
		for (int i = 1; i <= 10; i++) {
			jokbo.put("" + i + i, 3000 + (i * 10));
		}
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}

	SutdaDeck() {
		cards = new ArrayList<SutdaCard>();
		for (int i = 0; i < 20; i++) {
			cards.add(new SutdaCard(i % 10 + 1, ((i == 0 || i == 2 | i == 7) ? true : false)));
		}
		System.out.println(cards);
	}

	void shuffle() {
		//list 객체의 순서를 변경해주는 메서드
		Collections.shuffle(cards);
		//collections : 클래스 colloection : 인터페이스 colloection 하위 인터페이스 : list, set
		System.out.println(cards);
	}

	SutdaCard pick() {// 전달해주기
		return cards.remove(0);
	}
}

/*
 * Gamer 클래스 멤버 변수 : String name SutdaCard c1,c2 생성자 : 멤버변수 값을 입력받아 객체 생성. 멤버 변수
 * : int getScore() : c1,c2 카드의 점수 리턴 c1,c2 카드가 jokbo에 있는 경우 jokbo점수 리턴 jokbo에
 * 없는 경우 (c1.num +c2.num)%10 리턴 toString 오버라이딩 이름과 카드 2장을 문자열로 리턴
 */
class Gamer {
	String name;
	SutdaCard c1, c2;

	Gamer(String name, SutdaCard c1, SutdaCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}

	int getScore() {
		Integer score = 0;
		if (c1.isKwang && c2.isKwang) { //가장 점수가 높음.
			score = SutdaDeck.jokbo.get("KK");
		} else {
			score = SutdaDeck.jokbo.get("" + c1.number + c2.number);
			if (score == null) {
				score = (c1.number + c2.number) % 10;
			}
		}
		return score;
	}

	public String toString() {
		return name + "(" + c1 + "," + c2 + "):" + getScore();
	}
}

public class Exam5 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();// 20장을 가지고 있을거
		deck.shuffle();// 셔플될거
		List<Gamer> list = new ArrayList<>();
		list.add(new Gamer("홍길동", deck.pick(), deck.pick()));
		list.add(new Gamer("김삿갓", deck.pick(), deck.pick()));
		list.add(new Gamer("이몽룡", deck.pick(), deck.pick()));
		for (Gamer g : list)
			System.out.println(g);
		System.out.println("deck에 남은 카드의 갯수:" + deck.cards.size());
		//Gamer 중 가장 높은 점수를 가진 Gamer의 이름을 출력하기
		//gamer.name + " 승리"
		//getTotal() 값의 내림차순으로 정렬
		Collections.sort(list, new Comparator<Gamer>() {

			@Override
			public int compare(Gamer o1, Gamer o2) {
				return o2.getScore() - o1.getScore();
			}
		});
		if(list.get(0).getScore()== list.get(1).getScore())
		System.out.println("비김");
		else
			System.out.println(list.get(0).name + "승리!");
	}
}