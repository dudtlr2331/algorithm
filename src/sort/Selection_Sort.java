package sort;

public class Selection_Sort {
	public static void main(String[] args) {
		int[] array = {10,7,2,5,1,6,4};
		
		for(int i=0;i<array.length-1;i++) {
			int min = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		for(int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
	}
}
