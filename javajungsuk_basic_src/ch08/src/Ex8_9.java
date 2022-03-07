class Ex8_9 {
	public static void main(String[] args) throws Exception {
		method1();	 // 같은 클래스 내의 static 멤버이므로 객체생성없이 직접 호출 가능.
  	}	// end of main

	static void method1() throws Exception {
		method2();
	}	// end of method1

	static void method2() throws Exception {
		throw new Exception();
	}	// end of method2
}