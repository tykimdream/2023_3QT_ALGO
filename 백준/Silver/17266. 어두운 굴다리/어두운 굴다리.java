import java.util.*;

public class Main {
	static int n, m;
	static int[] light;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		light = new int[m];

		for (int i = 0; i < m; i++) {
			light[i] = sc.nextInt();
		}

		int high = n;
		int low = 1;
		int result = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = (high + low) / 2;
			if (possible(mid)) {
				result = Math.min(result, mid);
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println(result);
	}

	public static boolean possible(int h) {
		int prev = 0;

		for (int i = 0; i < light.length; i++) {
			if (light[i] - h <= prev) {
				prev = light[i] + h;
			} else {
				return false;
			}
		}

		return n - prev <= 0;
	}


}