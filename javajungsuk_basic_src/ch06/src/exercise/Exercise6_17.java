package exercise;

public class Exercise6_17 {

	// int배열을 매개변수로 받아서 배열에 저장된 각 요소들의 위치를 여러번 바꿔서 섞은 다음 반환하는 shuffle(int[] arr) 메서드
	public static int[] shuffle(int[] arr) {
		// 매개변수로 어떤 값이 넘어올지 모르기 때문에 작업을 시작하기 전에 값의 유효성체크는 반드시 해야 함
		// 아래의 코드는 넘겨받은 배열이 null 이거나 크기가 0 이면 그대로 반환
		if(arr == null || arr.length == 0) {
			return arr;
		}
		
		// 반복문을 이용해서 반복적으로 배열의 임의의 두 요소의 값을 바꿈
		for(int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random() * arr.length); // 배열의 크기 범위 안에서 난수 생성해서 j에 할당

			// arr[i] 와 arr[j]의 값을 서로 바꿈
			int tmp = arr[i];
			arr[i] = arr[j]; 
			arr[j] = tmp;
		}
		
		return arr; 
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5 ,6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
