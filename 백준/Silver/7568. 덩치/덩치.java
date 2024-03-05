import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int[][] arr = new int[people][2];
		int rank  = 1;
		int[] result = new int[people];
		
		for(int i = 0; i < people; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int i = 0; i < people; i++) {
			int myRank = 1;
			for(int j = 0; j < people; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					myRank++;
				}
			}
			result[i] = myRank;
		}
		for(int i = 0; i < people; i++) {
			System.out.print(result[i] + " ");
		}
	}

}