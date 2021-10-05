package exercise;

class SutdaDeck {
	final int CARD_NUM = 20;
	// SutdaCard 클래스에 cards라는 배열이 정의
	// SutdaCard 인스턴스가 생성된 것이 아니라 SutdaCard 인스턴스를 저장하기 위한 공간 생성
	// 객체 배열을 생성할 때 배열만 생성해 놓고 객체를 생성하지 않는 실수를 하지 않도록 주의 
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	// 생성자를 통해 객체배열 SutdaCard에 SutdaCard인스턴스를 생성해서 저장
	SutdaDeck() {
		// (1) 배열 SutdaCard를 적절히 초기화 하시오.
		// 반복문을 이용해서 배열의 크기만큼 SutdaCard 인스턴스 생성
		for(int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
		
		
	}
	
	// (2) 문제에 정의된 세 개의 메서드를 작성하시오
	
	// 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random() 사용)
	public void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random() * cards.length);
			
			// cards[i] 와 cards[j]의 값을 서로 바꾼다.
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
					
		}
	}
	
	// 배열 cards에 저장된 위치의 SutdaCard를 반환한다.
	public SutdaCard pick(int index) {
		// index의 유효성을 검사
		if(index > CARD_NUM || index < 0) {
			return null;
		}
		
		return cards[index];
	}
	
	// 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random() 사용)
	public SutdaCard pick() {
		int index = (int)(Math.random() * cards.length);
		
		return pick(index); // pick(int index)를 호출
	}
	
} // end of SutdaDeck

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object클래스의 toString()을 오버라이딩
	@Override
	public String toString() {
		return num + (isKwang ? "k" : "");
	}
} // end of SutdaCard

public class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.println(deck.cards[i] + ",");
			// System.out.println(deck.cards[i].toString() + ",");
		} // end of for
		
		System.out.println();
		System.out.println(deck.pick(0));
		
		
		
	} // end of main
} // end of class Exercise7_2
