import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static public class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	// 상 하 좌 우
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][m];
		int[][] dis = new int[n][m];

		Queue<Point> que = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			Arrays.fill(dis[i], Integer.MAX_VALUE - 1);
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 2) {
					que.add(new Point(i, j));
					dis[i][j] = 0;
				}
				if (map[i][j] == 0) {
					dis[i][j] = 0;
				}
			}
		}

		while (que.isEmpty() == false) {
			Point point = que.poll();

			for (int d = 0; d < 4; d++) {
				int nx = point.x + dx[d];
				int ny = point.y + dy[d];

				if (isIn(nx, ny) && map[nx][ny] != 0 && dis[nx][ny] > dis[point.x][point.y] + 1) {
					dis[nx][ny] = Math.min(dis[nx][ny], dis[point.x][point.y] + 1);
//					dis[nx][ny] = dis[point.x][point.y] + 1;
					que.add(new Point(nx, ny));
				}

			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dis[i][j] == Integer.MAX_VALUE - 1) {
					dis[i][j] = -1;
				}
			}
		}

		for (int[] a : dis) {
			for (int x : a) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	private static boolean isIn(int nx, int ny) {
		return nx >= 0 && nx < n && ny >= 0 && ny < m;
	}

}