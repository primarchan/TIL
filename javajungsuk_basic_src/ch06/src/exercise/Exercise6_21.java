package exercise;

public class Exercise6_21 {
	public static int abs(int value) {
		if(value >=0) {
			return value;
		} else {
			return -value; // value가 음수인 경우 부호를 변경한다
		}
		
		// 삼항연산자 이용
		//  return value >= 0 ? value : -value;
	}
	
	public static void main(String[] args) {
		int value= 5;
		System.out.println(value + "의 절댓값 : " + abs(value));
		value = -10;
		System.out.println(value + "의 절댓값 : " + abs(value));
	}
}
