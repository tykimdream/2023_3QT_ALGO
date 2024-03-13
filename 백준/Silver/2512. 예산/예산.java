import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] city = new int[n];
		int max = 0;
		int min = 1;
		
		for (int i = 0; i < n; i++) {
			city[i] = sc.nextInt();
			max = Math.max(max, city[i]);
		}
		
		int limit = sc.nextInt();
		int budget = (max + min) / 2;
		
		while (min <= max) {
			budget = (max + min) / 2;
			if (budgetCheck(limit, budget, city)) {
				min = budget + 1;
			} else {
				max = budget - 1;
			}
		}
		
		System.out.println(max);
	}

	private static boolean budgetCheck(int limit, int budget, int[] city) {
		for (int x : city) {
			if (x <= budget) {
				limit -= x;
			} else {
				limit -= budget;
			}
		}
		return limit >= 0 ? true : false;
	}

}