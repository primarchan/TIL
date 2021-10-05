class Ex9_3 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// identityHashCode - 객체마다 다른 해시코드 값을 반환하는 메서드
		System.out.println(System.identityHashCode(str1)); 
		System.out.println(System.identityHashCode(str2));
	}
}