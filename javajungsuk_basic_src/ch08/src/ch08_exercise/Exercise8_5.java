package ch08_exercise;

public class Exercise8_5 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		} // end of try - catch
		
	} // end of main
	
	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		} // end of try - catch, finally
		
		System.out.println(4);
	} // end of method1()
	
	static void method2() {
		throw new NullPointerException();
	} // end of method2()

} // end of class

// 3, 4

/*
**해설**
main 메서드가 method1을 호출하고, method1은  method2를 호출한다.
method2에서 NullPointerException이 발생했는데, 이 예외를 처리해줄 try - catch 블럭이 없으므로
method2는 종료되고, 이를 호출한 method1으로 되돌아 갔는데, 여기에는 try - catch 블럭이 있긴 하지만, 
NullPointerException을 처리해줄 catch블럭이 없으므로 method1도 종료되고, 이를 호출한 main 메서드로 돌아간다.
이 때, finally 블럭이 수행되어 '3'이 출력된다.
main메서드에서는 모든 예외를 처리할 수 있는 Exception이 선언된 catch블럭이 있으므로 예외가 처리되고, '5'가 출력된다.
 */
