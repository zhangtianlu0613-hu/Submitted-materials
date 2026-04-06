package week1_zhangtianlu;

public class Practice3 {
	public static void main(String[] args) {
		int [] array = {5,3,9,1,7};
		System.out.print("Maximum value in the array: "+findMax(array));
	}
	
	public static int findMax(int [] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
