abstract class Unit2 {
	int x, y;
	
	abstract void move(int x, int y);
	
	void stop() { System.out.println("멈춥니다."); }
	
}


interface Fightable { // 인터페이스으ㅣ 모든 메서드는 public abstract. 예외없이
	void move(int x, int y); // public abstract가 생략됨
	
	void attack(Fightable f); // public abstract가 생략됨
	
}

class Fighter extends Unit2 implements Fightable {
	public void move(int x, int y) {
		System.out.println("[" +  x + ", " + y + "]로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	Fightable getFightable( ) {
		// Fighter f  = new Fighter(); // Fighter를 생성해서 반환
		Fightable f = (Fightable)new Fighter();
		
		return f;
	}
	

	
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		Fightable f3 = f1.getFightable();
		
		Unit2 u = new Fighter(); 
		u.move(100, 200);
		// u.attack(new Fighter()); // Unit2에는 attack(Fightable f) 메서드가 없기 때문에 호출 불가
		u.stop();
		
		Fightable f2 = new Fighter();
		f2.attack(new Fighter());
		f2.move(100, 200);
		// f2.stop(); // Fightable에는 stop() 메서드가 없기 때문에 호출 불가
		
	}

}
