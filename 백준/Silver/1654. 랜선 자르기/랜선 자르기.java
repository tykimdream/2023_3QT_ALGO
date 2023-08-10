import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		long answer = 0;
		long [] wires = new long[K];
		for (int i = 0; i < K; i++) {
			wires[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(wires);
		long max = wires[K - 1];
		long min = 1;

		// 이분 탐색을 통하여 최대 길이를 구한다.
		// max와 min 사이에서 최적 값을 찾아야한다.
		while (min <= max) {
			long target = (max + min) / 2;
			int amount = count(wires, target);
			// target을 기준으로 잘라본다.
			if(amount >= N) {
				answer = Math.max(answer, target);
				min = target + 1;
			} else {
				max = target - 1;
			}
		}
		System.out.println(answer);
	}
	public static int count(long[] arr, long standard) {
		int result = 0;
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			result += (arr[i] / standard);
		}
		
		return result;
	}
}