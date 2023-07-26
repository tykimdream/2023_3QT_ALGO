import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static String max = "0", min = "9876543211";
	static int[] result, num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static boolean[] used = new boolean[10];
	static String[] op;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		op = new String[n];
		result = new int[n + 1];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			op[i] = st.nextToken();
		}
		
		for (int i = 0; i < 10; i++) {
			used[i] = true;
			result[0] = i;
			dfs(i, 1);
			used[i] = false;
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void dfs(int prev, int depth) {
		if (depth == n + 1) {
			String temp = "";
			for(int i = 0; i < n + 1; i++) {
				temp += result[i] +"";
			}
			long tempI = Long.parseLong(temp);
			long maxI = Long.parseLong(max);
			long minI = Long.parseLong(min);
			if(maxI < tempI) {
				max = temp;
			}
			if(minI > tempI) {
				min = temp;
			}
			return;
		}
		
		for (int i = 0; i < 10; i++) {
			if (used[i])
				continue;
			if (op[depth - 1].equals(">")) {
				if (i < prev) {
					used[i] = true;
					result[depth] = i;
					dfs(i, depth + 1);
					used[i] = false;
				}
			} else if (op[depth - 1].equals("<")) {
				// < 인 경우, prev보다 큰 수만 넣을 수 있음
				if (i > prev) {
					used[i] = true;
					result[depth] = i;
					dfs(i, depth + 1);
					used[i] = false;
				}
			}
		}

	}
}