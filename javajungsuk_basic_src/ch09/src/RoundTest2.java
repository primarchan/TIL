
public class RoundTest2 {
	public static void main(String[] args) {
		
		int i = Integer.parseInt("100"); // 문자열 "100"을 Integer 클래스의 parseInt() 메서드를 이용해 int로 변환하여 i에 할당
		System.out.println("i = " + i);
		
		System.out.println("-----------------------------------");
		
		System.out.println("i = " + Integer.parseInt("100"));
		System.out.println("i = " + Integer.parseInt("100", 10)); // 10진수는 생략가능(자동으로 추가)
		System.out.println("i = " + Integer.parseInt("100", 2)); // 2진수로 출력
		System.out.println("i = " + Integer.parseInt("FF", 16)); // 16진수로 출력
	}

}
