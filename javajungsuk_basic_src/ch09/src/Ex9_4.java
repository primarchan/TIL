import java.util.Objects;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// Object 클래스의 toString() 메서드를 오버라이딩
	@Override
	public String toString() {
		
		return "kind : " + kind + ", number : " + number;
	}
	
	// Object 클래스의 equals 메서드를 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		
		return this.kind.equals(c.kind) && this.number == c.number;
	}
	
	// Object 클래스의 equals 메서드를 오버라이딩하면 hashCode()도 오버라이딩 해야 함
	@Override
	public int hashCode() {
		
		// Objects 클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
		return Objects.hash(kind, number); // int hash(Object..values..){...} 매개변수가 가변인자(Object...)라서 호출시 지정하는 값의 개수가 정해져있지 않음
	}
	
}

class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}