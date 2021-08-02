package sort;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] array = { 10, 7, 2, 5, 1, 6, 4 }; // 배열 설정

		for (int i = 1; i < array.length; i++) {
			int j = i - 1; // 비교대상
			int temp = array[i]; // 비교하는 수의 카피
			while (j >= 0 && temp < array[j]) {// j의 값이 0보다 작고 temp값이 array[j]값보다 크면탈출
				array[j + 1] = array[j]; // 앞에 대상에 더 큰 경우 오른쪽으로 밀어낸다.
				j--;
			}
			array[j + 1] = temp; // 카피된 값 저장
		}
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
	}
}
