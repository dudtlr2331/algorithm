package JAVA_�˰���;

//import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		
//		System.out.println("�� ������ �ִ��� ���մϴ�.");
//		System.out.print("a�� �� : "); int a = stdIn.nextInt();
//		System.out.print("b�� �� : "); int b = stdIn.nextInt();
//		System.out.print("c�� �� : "); int c = stdIn.nextInt();
//		
//		int max = a;
//		if(b > max) max = b;
//		if(c > max) max = c;
//		
//		System.out.println("�ִ��� " + max + "�Դϴ�.");
		max4(4,5,4,6);
		min3(4,5,4);
		min4(4,5,4,1);
		
	}
	static void max4(int a, int b, int c, int d){
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}
	static void min3(int a, int b, int c){
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		System.out.println("�ּڰ��� " + min + "�Դϴ�.");
	}
	static void min4(int a, int b, int c, int d){
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		System.out.println("�ּڰ� " + min + "�Դϴ�.");
	}
}
