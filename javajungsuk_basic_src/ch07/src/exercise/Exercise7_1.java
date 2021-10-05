package exercise;

class SutdaDeck2 {
	final int CARD_NUM = 20;
	// SutdaCard 클래스에 cards라는 배열이 정의
	// SutdaCard 인스턴스가 생성된 것이 아니라 SutdaCard 인스턴스를 저장하기 위한 공간 생성
	// 객체 배열을 생성할 때 배열만 생성해 놓고 객체를 생성하지 않는 실수를 하지 않도록 주의 
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	
	// 생성자를 통해 객체배열 SutdaCard에 SutdaCard인스턴스를 생성해서 저장
	SutdaDeck2() {
		// (1) 배열 SutdaCard를 적절히 초기화 하시오.
		// 반복문을 이용해서 배열의 크기만큼 SutdaCard 인스턴스 생성
		for(int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard2(num, isKwang);
		}
		
	}
}

class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2() {
		this(1, true);
	}
	
	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object클래스의 toString()을 오버라이딩
	@Override
	public String toString() {
		return num + (isKwang ? "k" : "");
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.println(deck.cards[i] + ",");
			// System.out.println(deck.cards[i].toString() + ",");
		}
	}
}
