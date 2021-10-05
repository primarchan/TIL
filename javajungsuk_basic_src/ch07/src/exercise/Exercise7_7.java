package exercise;

// 외부 클래스
class Outer2 {
	// 내부 클래스(static 클래스)
	static class Inner2 {
		int iv = 200;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		// (1) 알맞는 코드를 넣어 완성하시오.
		
		// 스태틱 클래스(static inner class)는 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지 않고도 사용 가능
		Outer2.Inner2 ii = new Outer2.Inner2();
		System.out.println(ii.iv);
		
	}

}
