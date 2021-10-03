package exercise;

public class Exercise6_5_PlayingCard {
	// 인스턴스 변수
	int kind;
	int num;
	
	// 클래스 변수(static 변수)
	static int width;
	static int height;
	
	Exercise6_5_PlayingCard(int k, int n) {
		// 지역 변수
		kind = k;
		num = n;
		
	}
	
	public static void main(String[] args) {
		Exercise6_5_PlayingCard card = new Exercise6_5_PlayingCard(1, 1);
	}

}

// 클래스 변수 (static 변수) : width, height 
// 인스턴스변수 : kind, num 
// 지역 변수 : k, n, card, args 