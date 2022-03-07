class Ex8_4 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); 	// 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException");
		} catch (Exception e){ // Exception 클래스는 모든 예외 클래스의 조상이기 때문에 모든 예외 처리 가능. 따라서 가장 마지막 catch블럭으로 사용해야 함
			System.out.println("Exception");
		}	// end of try-catch
		System.out.println(6);
	}	// end of main
}