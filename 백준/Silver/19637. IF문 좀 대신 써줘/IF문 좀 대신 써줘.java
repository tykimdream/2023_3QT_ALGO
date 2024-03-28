import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] levels = new int[n];
		String[] titles = new String[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			titles[i] = st.nextToken();
			levels[i] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			int score = Integer.parseInt(br.readLine());
			sb.append(getTitle(score, levels, titles, n, m) + "\n");
		}

		System.out.println(sb.toString());
	}

	private static String getTitle(int score, int[] levels, String[] titles, int n, int m) {
		int bottom = 0;
		int top = n - 1;
		int mid = (bottom + top) / 2;

		while (bottom <= top) {
			mid = (bottom + top) / 2;
			if (score > levels[mid]) {
				bottom = mid + 1;
			} else {
				top = mid - 1;
			}
		}

		return titles[bottom];
	}

}