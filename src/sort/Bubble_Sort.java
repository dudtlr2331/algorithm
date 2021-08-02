package sort;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] array = { 10, 7, 2, 5, 1, 6, 4 };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
	}
}
