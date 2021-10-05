package exercise;

class Product {
	int price;      // 제품의 가격
	int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

	// Product 클래스의 기본 생성자
	Product() {}
	
	// Product 클래스의 price를 매개변수로 가지는 생성자
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv extends Product{
	// Tv 클래스의 기본 생성자
	Tv() {
		// 컴파일러가 자동적으로 추가
		// super();
	}
	
	// Object클래스의 toString()을 오버라이딩
	@Override
	public String toString() {
		return "Tv";
	}
}

public class Exercise7_3 {
	public static void main(String[] args) {
		// Tv 클래스의 인스턴스를 생성할 때 생성자 Tv()가 호출되고 Tv()는 조상 생성자 super()를 호출
		// 실제 코드에서는 super()를 호출하는 곳이 없지만 컴파일러가 자동적으로 추가
		Tv t = new Tv();
	}
}
