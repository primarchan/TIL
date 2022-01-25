package String1;

import java.util.Scanner;

public class Main {
	
	// 인스턴스 메서드인 solution, 호출하려면 객체(인스턴스) 생성
	public int solution(String str, char t) {
		int answer = 0;
		
		// 입력받은 문자열과 문자를 대문자로 변환
		str = str.toUpperCase();
		t = Character.toUpperCase(t); // 문자이므로 Character 클래스에 있는 toUpperCase() 사용
		// System.out.println(str + " " + t);
		
		/*
		// 입력받은 문자열의 길이만큼 반복문 실행
		for(int i = 0; i < str.length(); i++) {
			// 입력받은 문자열에 인덱스 순서대로 접근 후 조건에 해당하면 answer값 증가
			if(str.charAt(i) == t) {
				answer++;
			}
		}
		*/
		
		// 향상된 for문 사용
		// for(타입 변수 : (배열, Iterator를 제공하는 컬렉션프레임워크))
		// 문자열을 배열 객체로 변환해주는 toCharArray() 사용
		for(char x : str.toCharArray()) {
			if(x == t) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main(); // 인스턴스 메서드인 solution을 호출하기 위해 객체(인스턴스) 생성
		
		// 콘솔 입출력을 위해 Scanner 객체 생성, 변수 kb는 keyboard의 약자
		Scanner kb = new Scanner(System.in);
		
		// 문자열을 입력받기, next() : 콘솔에서 문자열 입력받음
		String str = kb.next();
		
		// 문자 입력받기, next()로 입력받은 문자열에서 charAt()으로 문자열에 인덱스로 접근
		char c = kb.next().charAt(0);
		
		System.out.print(T.solution(str, c));
	}

}
