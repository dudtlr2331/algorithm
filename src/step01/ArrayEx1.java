package step01;

public class ArrayEx1 {

	public static void main(String[] args) {
//		int [] score;
//		score = new int [5];
		
		
		int [] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 50;
		score[k+1] = 50;
		score[3] = 50;
		score[4] = 50;
		
		int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4]
		
		//for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i < 5; i++) {
			System.out.printf("score[%d}: %d%n", i, score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d} : %d%n", 7, score[7]);
	}

}

