import java.util.ArrayList;

public class RoundTest3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); // Integer 객체를 저장하는 ArrayList 객체 배열 list를 선언
		list.add(new Integer(100)); // list 에는 객체만 추가가능
		list.add(100); // JDK 1.5 이전에는 에러
		
		// Integer i = list.get(0); // list에 저장된 첫번째 객체를 꺼낸다.
		// int i = list.get(0).intValue(); // intValue()로 int로 변환
		int i = list.get(0);
	}

}
