package Doit_chap02;

public class PrimeNumber1 {//�ǽ����� 2-9
	public static void main(String[] args) {
		int counter = 0;			// �������� Ƚ��

		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				counter++;
				if (n % i == 0)		// ����������� �Ҽ��� �ƴ�
					break;			// �� �̻��� �ݺ��� ���ʿ�
			}
			if (n == i)				// ���������� ����������� ����
				System.out.println(n);
		}

		System.out.println("�������� ������ Ƚ����" + counter);
	}
}