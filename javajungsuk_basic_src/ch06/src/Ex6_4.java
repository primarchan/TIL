class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); // add메서드 호출
		long result2 = mm.subtract(5L, 3L); // substract메서드 호출
		long result3 = mm.multiply(5L, 3L); // multiply메서드 호출
		double result4 = mm.divide(5L, 3L); // divide메서드 호출
		long result5 = mm.max(5L, 3L); // max메서드 호출

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5L, 3L) = " + result5);
		mm.printGugudan(3); // 구구단 3단을 출력
	}
 }
 
 // MyMath 클래스는 4개의 메서드(add, subtract, multiply, divide)를 가지고 있다.
 class MyMath {
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) { return a / b; }
	
	// 두 값을 받아서 둘 중에 큰 값을 반환하는 메스드를 작성하시오.
	long max(long a, long b) {		
		long result = 0;
		if(a > b) {
			result = a;
		}else {
			result = b;
		}
	
		// result = a > b ? a : b; // 삼항연산자 사용
		
		return result;
	}
	
	// 구구단 출력 메서드
	void printGugudan(int dan) {
		if(!(2 <= dan && dan <= 9)) {
			return; // 입력받은 단(dan)이 2 ~ 9 가 아니면, 메서드 종료하고 돌아가기
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
	}
 }
