import java.util.*;

class Ex11_1 {
	public static void main(String[] args) {
		// 기본 길이(용량, capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		// ArrayList에는 객체만 저장가능
		// autoboxing에 의해 기본형이 참조형으로 자동 변환
		list1.add(new Integer(5)); // list1.add(5_;
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// ArrayList()의 생성자 중 ArrayList(Collection c)를 사용
		// ArrayList(Collection c) - 주어진 컬렉션이 저장된 ArrayList를 생성
		ArrayList list2 = new ArrayList(list1.subList(1,4)); 
		// 풀어쓰면 아래 두 줄과 동일
		// List sub = list1.subList(1,4); // sub는 읽기만 가능[4, 2, 0] - 1번 인덱스 부터 3번 인덱스(4번 인덱스 전)까지 
		// ArrayList list2 = new ArrayList(sub); // sub와 같은 내용의 ArrayList 생성
		
		print(list1, list2);

		// Collection은 인터페이스, Collections는 Util 클래스(Ex. Math 클래스)
		Collections.sort(list1);	// list1과 list2를 정렬한다.
		Collections.sort(list2);	// Collections.sort(List 1)
		print(list1, list2);

		// containsAll() 메서드 : list1의 요소가 list2의 모든 요소를 포함하고 있는지 확인하는 메서드
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		 
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 인덱스가 3인 곳에 "A"를 추가
		print(list1, list2);

		list2.set(3, "AA"); // 인덱스가 3인 곳을 "AA"로 변경
		print(list1, list2);

		list1.add(0, "1");
		// indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("index="+list1.indexOf("1"));
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

		print(list1, list2);

		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i); // 인덱스가 i인 곳에 저장된 요소를 삭제
		}
		print(list1, list2);
	} // main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class