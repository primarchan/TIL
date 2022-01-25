package String2;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		/*
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			} else {
				answer += Character.toLowerCase(x);
			}
		}
		*/
		
		// ASCII(American Standard Code for information interchange) 코드 값 기준
		// 대문자 : 65 ~ 90 / 소문자 : 97 ~ 122
		// 대문자와 소문자의 차이는 32
		// 문자(charater)는 정수형이므로 대소 비교 가능
		for(char x : str.toCharArray()) {
			if(x >= 97 && x <= 122) {
				answer += (char)(x - 32);
			} else {
				answer += (char)(x + 32);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}

}
