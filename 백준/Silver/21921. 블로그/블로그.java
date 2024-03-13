import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		int[] today = new int[n];

		int max = 0;
		int tail = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

			if (i < x) {
				today[i] = arr[i];
				if(i > 0) today[i] += today[i - 1];
			} else {
				today[i] = arr[i] + today[i - 1] - tail;
			}
			if(i - (x - 1) >= 0)
				tail = arr[i - x + 1];

			max = Math.max(today[i], max);
		}

		if (max == 0) {
			System.out.println("SAD");
			return;
		}
		int count = 0;
		for (int t : today) {
			if (t == max)
				count++;
		}
		System.out.println(max);
		System.out.println(count);
	}

}