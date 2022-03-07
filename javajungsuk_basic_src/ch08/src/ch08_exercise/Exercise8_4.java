package ch08_exercise;

public class Exercise8_4 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) throw new ArithmeticException(); // ArithmeticException은 RuntimeException의 자손
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return; // 메서드를 종료하고 빠져나옴 (finally를 수행한 후에)
		} catch (Exception e) {
			System.out.println(4);
			return; // // 메서드를 종료하고 빠져나옴 (finally를 수행한 후에)
		} finally { 
			System.out.println(5); // 예외 발생 여부 관계없이 항상 실행되는 문장
		} // end of try - catch, finally
		
		System.out.println(6);
	} // end of method
	
	public static void main(String[] args) {
		method(true); // 1, 3, 5
		method(false); // 1, 2, 5, 6
	} // end of main

} // end of class
