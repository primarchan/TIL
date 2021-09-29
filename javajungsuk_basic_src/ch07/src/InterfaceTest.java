class A {
	// public void method(B b) {
	public void method(I i) { // 인터페이스 I를 구현한 것들만 들어올 수 있음
		i.method();
	}
}

interface I {
	public void method();
}

class B implements I {
	@Override
	public void method() {
		System.out.println("B클래스의 메서드");		
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C()); // A가 B를 사용(의존)
	}

}
