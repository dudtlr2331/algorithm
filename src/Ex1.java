import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("o, e �� �ϳ��� ���ڸ� �Է����ּ��� : ");
		char ch = sc.next().charAt(0);

		int sumNum = 0;
		int start = 0;
		
		if(ch == 'o')
			start = 2;
		else
			start = 1;
		
		
			for (int i = start; i <= 100; i += 2) {
				sumNum += i;
				if (sumNum > 101) {
					System.out.println("Ȧ���� ���� 101�� ���ʷ� �Ѵ� Ȧ���� " + i + "�Դϴ�.");
					break;
				}else if (sumNum > 100) {
					System.out.println("¦���� ���� 100�� ���ʷ� �Ѵ� ¦���� " + i + "�Դϴ�.");
					break;
			}

		}
	}
}
