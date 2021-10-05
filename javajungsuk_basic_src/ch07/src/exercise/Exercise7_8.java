package exercise;

class Outer3 {
	// 외부 클래스의 인스턴스 변수는 내부 클래스에서 외부클래스이름.this.변수이름로 접근
	int value = 10; // Outer3.this.value
	
	class Inner3 {
		int value = 20; // this.value
		
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
		
	} // end of Inner 클래스
} // end of Outer 클래스

public class Exercise7_8 {
	public static void main(String[] args) {
		// 알맞는 코드를 넣어 완성하시오.
		Outer3 outer3 = new Outer3();
		Outer3.Inner3 inner3 = outer3.new Inner3();
		
		inner3.method1();
	}

}
