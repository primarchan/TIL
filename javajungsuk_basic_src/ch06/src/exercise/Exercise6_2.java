package exercise;

public class Exercise6_2 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}
}

class Student2 {
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어 점수
	int eng; // 영어 점수
	int math; // 수학 점수
	
	// Student 클래스의 기본 생성자
	public Student2() {
		
	}
	
	// Student 클래스의 생성자
	// 학생의 이름 반 번호 과목별 성적을 매개변수로 받는 생성자
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// Student의 정보를 출력하는 info() 메서드
	public String info() {
		return name
				+ ", " + ban
				+ ", " + no
				+ ", " + kor
				+ ", " + eng
				+ ", " + math
				+ ", " + (kor + eng + math)
				+ ", " + ((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f); // 소수점 첫 째자리까지 반올림

	}
	
}