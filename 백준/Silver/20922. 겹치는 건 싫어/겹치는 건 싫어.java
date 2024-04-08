import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int SIZE = 100001;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		int[] accum = new int[SIZE];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max_length = 0;
		int start = 0;
		int end = 0;

		while (end < N) {
			while (end < N && accum[arr[end]] + 1 <= K) {
				accum[arr[end]]++;
				end++;
			}
			max_length = Math.max(max_length, (end - start));
			accum[arr[start]]--;
			start++;
		}

		System.out.println(max_length);
	}

}