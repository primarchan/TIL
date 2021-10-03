package exercise;

public class Exercise6_18 {
	public static boolean isNumber(String str) {
		// 매개변수로 어떤 값이 넘어올지 모르기 때문에 값의 작업을 시작하기 전에 유효성 체크는 반드시 해야 함
		// 아래의 코드는 넘겨받은 문자열이 null이거나 빈 문자열 ("")이면 false를 반환
		if(str == null || str.equals("")) {
			return false;
		}
		
		// 반복문과 을 이용해서 문자열에서 한 문자씩 차례대로 읽어와 타입의 charAt(int i) char변수 에 저장
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			// 읽어온 문자 가 숫자가 아니면 를 반환
			if(ch < '0' || ch > '9')
				return false;
		} // end of for
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
