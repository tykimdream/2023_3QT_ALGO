import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] station = new int[n];
		int[] road = new int[n - 1];
		int total = 0;

		for (int i = 0; i < n - 1; i++) road[i] = sc.nextInt();
		for (int i = 0; i < n; i++) station[i] = sc.nextInt();
		
		for (int i = 0; i < n - 1; i++) {
			int dis = 0;
			int skip = 0;
			for(int j = i; j < n - 1; j++) {
				if(station[i] > station[j]) {
					break;
				} else {
					dis += road[j];
					skip++;
				}				
			}
			total += station[i] * dis;
			i += (skip - 1);
		}
        
		System.out.println(total);
	}
}