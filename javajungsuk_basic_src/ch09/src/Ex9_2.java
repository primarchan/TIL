class Person {
	long id; // this.id

	public boolean equals(Object obj) {
/*		
		if(obj instanceof Person)
			return id ==((Person)obj).id; // obj가 Object 타입이므로 id값을 참조하기 위해서튼 Person 타입으로 형변환이 필요
		else
			return false;
*/		
		if(!(obj instanceof Person))
			return false;
		
		// Person p = (Person)obj;
		// return this.id == p.id
		
		return this.id == ((Person)obj).id;
	}

	Person(long id) {
		this.id = id;
	}
}

class Ex9_2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if(p1.equals(p2))
			System.out.println("p1과 p2은 같은 사람입니다.");
		else
			System.out.println("p1과 p2은 다른 사람입니다.");
	}
	
}