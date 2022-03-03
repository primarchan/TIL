
public class ExceptionTest extends Object{
	public static void main(String[] args) { // 런타임 에러(Runtime Error) 발생
		// system.out.println(args[0]); 컴파일 에러(Compile Error)가 발생 발생
		// javac.exe : Java Compiler -> 구문 체크, 번역, 최적화, 생략된 코드 추가
		// Alt + Enter : 해당 클래스의 경로 확인 가능
		
		System.out.println(args[0]); // 런타임 에러(Runtime Error)가 발생 발생
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 at ExceptionTest.main(ExceptionTest.java:8)
		
	}
}
