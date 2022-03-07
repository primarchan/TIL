package ch08_exercise;

public class Exercise8_6 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) System.exit(0);
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		} // end of try - catch, finally
		
		System.out.println(6);
	} // end of method
	
	public static void main(String[] args) {
		method(true);
		method(false);
	} // end of main

} // end of class

// 1

/*
[해설]
변수 b의 값이 true이므로, System.exit(0);이 수행되어 프로그램이 즉시 종료된다. 이런 경우는 finally 블럭이 수행되지 않음.
 */