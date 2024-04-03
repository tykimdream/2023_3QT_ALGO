import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		// 내 왼쪽에 나보다 큰 사람의 수
		int[] arr = new int[N];
		Arrays.fill(arr, 0);

		st = new StringTokenizer(br.readLine());
		for (int n = 0; n < N; n++) {
			arr[n] = Integer.parseInt(st.nextToken());
		}

		// 정답을 저장할 배열 (해당 위치의 사람의 키를 저장)
		int[] ans = new int[N];

		for (int i = 0; i < N; i++) {
			int big_people = arr[i];
			int cur_tall = i + 1;

			for (int j = 0; j < N; j++) {
				// 현재 위치의 사람이 나보다 큰 경우 혹은 빈자리인 경우
				// 빈자리의 경우, 뒷사람 즉, 나보다 큰 사람이 들어오기 때문에
				// count를 하나 뺀다.
				if (ans[j] > cur_tall || ans[j] == 0) {
					big_people--;
				}

				// 나보다 큰 사람이 줄에 더 이상 없는 경우
				if (big_people < 0) {
					// 빈 위치에 삽입한다.
					if (ans[j] == 0) {
						ans[j] = cur_tall;
						break;
					}
				}
			}
		}

		for (int x : ans) {
			System.out.print(x + " ");
		}

	}

}