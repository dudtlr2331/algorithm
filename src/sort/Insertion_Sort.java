package sort;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] array = { 10, 7, 2, 5, 1, 6, 4 }; // �迭 ����

		for (int i = 1; i < array.length; i++) {
			int j = i - 1; // �񱳴��
			int temp = array[i]; // ���ϴ� ���� ī��
			while (j >= 0 && temp < array[j]) {// j�� ���� 0���� �۰� temp���� array[j]������ ũ��Ż��
				array[j + 1] = array[j]; // �տ� ��� �� ū ��� ���������� �о��.
				j--;
			}
			array[j + 1] = temp; // ī�ǵ� �� ����
		}
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
	}
}
