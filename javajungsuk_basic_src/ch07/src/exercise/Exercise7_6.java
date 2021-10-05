package exercise;

class Outer {
	class Inner {
		int iv = 100;
	}
}

public class Exercise7_6 {
	public static void main(String[] args) {
		// (1) 알맞는 코드를 넣어 완성하시오.
		
		// 외부 클래스 인스턴스 생성
		Outer o = new Outer();
		// 내부 클래스 인스턴스 생성
		Outer.Inner ii = o.new Inner();
		
		System.out.println(ii.iv);
	}

}
