import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int turn = 1;
		for(int i = 0; i < n; i++) {
			arr[i] = turn;
			if(i + 2 < n) {
				arr[i + 2] = turn;				
			}
			turn *= -1;
		}
		
		if(arr[n - 1] == -1) {
			System.out.print("SK");
		} else {
			System.out.print("CY");			
		}
	}
}