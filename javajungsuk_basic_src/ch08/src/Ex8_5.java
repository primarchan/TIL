class Ex8_5 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생!!!
			System.out.println(4);   // 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			ae.printStackTrace();
			System.out.println("예외 메시지 : " + ae.getMessage());
		}	// end of try-catch

		System.out.println(6);
	}	// end of main
}