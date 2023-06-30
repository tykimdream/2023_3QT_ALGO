import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int ans = Integer.MIN_VALUE;
	static int[][] map;
	static boolean[][] visited;

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static Queue<int[]> virus = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) {
					virus.add(new int[] { i, j });
				}
			}
		}

		comb(0);
		System.out.println(ans);
	}

	private static void comb(int cnt) {
		if (cnt == 3) {
			// 가상의 벽이 완성됨
			spreadVirus();
			SafeArea();
			return;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] != 0)
					continue;
				map[i][j] = 1;
				comb(cnt + 1);
				map[i][j] = 0;
			}
		}

	}

	private static void SafeArea() {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0 && !visited[i][j]) {
					cnt++;
				}
			}
		}
		ans = Math.max(ans, cnt);
	}

	private static void spreadVirus() {
		// TODO Auto-generated method stub
		Queue<int[]> temp = new LinkedList<>();
		temp.addAll(virus);
		visited = new boolean[N][M];
		while (!temp.isEmpty()) {
			int[] cur = temp.poll();
			int x = cur[0];
			int y = cur[1];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (!isIn(nx, ny) || visited[nx][ny] || map[nx][ny] != 0)
					continue;
				temp.add(new int[] { nx, ny });
				visited[nx][ny] = true;
			}
		}
	}

	private static boolean isIn(int nx, int ny) {
		// TODO Auto-generated method stub
		return (nx >= 0 && nx < N && ny >= 0 && ny < M);
	}

}
