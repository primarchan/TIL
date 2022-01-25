package String3;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		// 정수 중 가장 작은 값으로 초기화 : -2^31(-2,147,483,648)
		// Tip. 정수 중 가장 큰 값으로 초기화 : 2^31-1(2,147,483,647)
		int m = Integer.MIN_VALUE, pos;
		
		while((pos = str.indexOf(' '))!= -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		if(str.length() > m) {
			answer = str;
		}
		
		/*
		// 문장의 단어들을 띄어쓰기 기준으로 분리해서 String 배열에 저장 -> split 사용
		String[] s = str.split(" ");
		
		for(String x : s) {
			// System.out.println(x);
			int len = x.length(); // 단어 길이를 len에 저장
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		*/
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		// Scanner의 nextLine() : 문자열들(문장)로 입력
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}

}
