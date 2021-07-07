package JAVA_알고리즘;

//import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//		
//		System.out.println("세 정수의 최댓값을 구합니다.");
//		System.out.print("a의 값 : "); int a = stdIn.nextInt();
//		System.out.print("b의 값 : "); int b = stdIn.nextInt();
//		System.out.print("c의 값 : "); int c = stdIn.nextInt();
//		
//		int max = a;
//		if(b > max) max = b;
//		if(c > max) max = c;
//		
//		System.out.println("최댓값은 " + max + "입니다.");
		max4(4,5,4,6);
		min3(4,5,4);
		min4(4,5,4,1);
		
	}
	static void max4(int a, int b, int c, int d){
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
	static void min3(int a, int b, int c){
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		System.out.println("최솟값은 " + min + "입니다.");
	}
	static void min4(int a, int b, int c, int d){
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		System.out.println("최솟값 " + min + "입니다.");
	}
}
