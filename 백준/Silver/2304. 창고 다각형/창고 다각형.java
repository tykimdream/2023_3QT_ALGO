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
		int[][] pillar = new int[N][2];
		int tall = 0;

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			pillar[n][0] = Integer.parseInt(st.nextToken());
			pillar[n][1] = Integer.parseInt(st.nextToken());

			// 가장 큰 기둥 높이 구하기
			tall = Math.max(pillar[n][1], tall);
		}

		// x좌표 순서로 정렬
		Arrays.sort(pillar, (o1, o2) -> {
			return o1[0] - o2[0];
		});

		// 가장 큰 기둥 중 제일 왼쪽에 있는 기둥
		int highest = 0;
		for (int i = 0; i < N; i++) {
			if (pillar[i][1] == tall)
				highest = i;
		}

		int size = tall;

		// 제일 첫 기둥
		int prevX = pillar[0][0];
		int prevH = pillar[0][1];

		// 왼쪽 탐색
		// 가장 끝 기둥이 가장 높은 기둥이 보장되므로
		// 작은 경우로 끝나는 경우는 고려할 필요가 없음
		for (int i = 0; i <= highest; i++) {
			// 이전 기둥보다 큰 기둥이 나타나면 넓이 구하기
			if (pillar[i][1] >= prevH) {
				size += (pillar[i][0] - prevX) * prevH;
				// 현재 기둥 정보 갱신
				prevX = pillar[i][0];
				prevH = pillar[i][1];
			}
		}

		// 마지막 기둥
		prevX = pillar[N - 1][0];
		prevH = pillar[N - 1][1];

		// 오른쪽 탐색
		for (int i = N - 1; i >= highest; i--) {
			// 이전 기둥보다 큰 기둥이 나타나면 넓이 구하기
			if (pillar[i][1] >= prevH) {
				size += (prevX - pillar[i][0]) * prevH;
				// 현재 기둥 정보 갱신
				prevX = pillar[i][0];
				prevH = pillar[i][1];
			}
		}

		System.out.println(size);
	}

}