package Doit_chap01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� �������� �ڸ����� ���մϴ�.");

		int n;
		do {
			System.out.print("��������");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0; 			// �ڸ���
		while (n > 0) {
			n /= 10; 			// n�� 10���� ����
			no++;
		}

		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
	}
}
