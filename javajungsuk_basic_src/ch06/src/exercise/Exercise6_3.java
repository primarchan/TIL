package exercise;

public class Exercise6_3 {
	public static void main(String[] args) {
		Student3 s = new Student3();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
	
}

class Student3 {
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어 점수
	int eng; // 영어 점수
	int math; // 수학 점수
	
	// Student 클래스의 기본 생성자
	public Student3() {
		
	}
	
	// Student 클래스의 생성자
	// 학생의 이름 반 번호 과목별 성적을 매개변수로 받는 생성자
	public Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 총합을 구하는 getTotal() 메서드
	public int getTotal() {
		return kor + eng + math;
	}
	
	// 평균을 구하는 getAverage() 메서드
	public float getAverage() {
		return ((int)((kor + eng + math) / 3f * 10 + 0.5f)) / 10f;
/*
		총점의 타입이 이기 때문에 으로 나누면 와 간의 연산이므로 결과를 로 얻 int 3 int int int
		는다 즉 소수점 이하의 값은 버려지게 된다 그래서 타입의 리터럴인 로 나누어 . , . float 3f
		야 소수점 이하의 값들을 얻을 수 있다 그리고 소수점 둘째 자리에서 반올림하려면 . , 10
		을 곱하고 를 더한 다음 다시 로 나누면 된다 0.5 10f .		
		236 / 3 78 →
		236 / 3f 78.666664 →
		236 / 3f * 10 786.66664 →
		236 / 3f * 10 + 0.5 787.16664 →
		(int)(236 / 3f * 10 + 0.5) (int)787.16664 → → 787
		(int)(236 / 3f * 10 + 0.5) / 10 78 →
		(int)(236 / 3f * 10 + 0.5) / 10f 78.7 
 */
	}
	
}