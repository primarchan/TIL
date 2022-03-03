class Ex8_2 {
	public static void main(String args[]) {
			System.out.println(1);
			try {
				System.out.println(0/0); // 0으로 나누기 금지
				System.out.println(2); 	// 예외가 발생한 이후 코드는 실행되지 않는다.
			} catch (ArithmeticException ae)	{
				System.out.println(3);
			}	// end of try-catch
			System.out.println(4);
	}	// end of main
	
	
	/*
	try - catch문에서의 흐름
	
	try블럭 내에서 예외가 발생한 경우,
	1) 발생한 예외와 일치하는 catch블럭이 있는지 확인한다.
	2) 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 전체 try - catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다.
	   만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못한다. (프로그램 비정상 종료)
	   
	try블럭 내에서 예외가 발생하지 않은 경우,
	1) catch블럭을 거치지 않고 전체 try - catch문을 빠져나가서 수행을 계속 한다.   
	*/
}
