package exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		System.out.println(map); // OK. 이미 존재하는 키 추가기능. 기존 값은 없어짐
		
		Scanner s = new Scanner(System.in); // 화면으로부터 라인단위로 입력받는다.
		
		while(true) {
			System.out.println("id 와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim(); // trim 메서드로 공백 제거
			
			System.out.println("password :");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) { // HashMap의 get 메서드 호출시 지정된 키(key)의 값(객체) 반환. 못찾으면 null 반환 
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			} // end of i
			
		} // end of while
		
	} // end of main

}
