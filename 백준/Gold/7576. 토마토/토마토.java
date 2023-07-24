import java.util.*;
import java.io.*;

public class Main {
	static Queue<int[]> que = new LinkedList<>();
	static int n, m, day;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1) {
					que.add(new int[] { i, j, 0 });
				}
			}
		}

		while (!que.isEmpty()) {
			int[] temp = que.poll();
			int x = temp[0];
			int y = temp[1];
			int date = temp[2];
			map[x][y] = 1;
			day = Math.max(day, date);
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (isIn(nx, ny) && !visited[nx][ny] && map[nx][ny] == 0) {
					visited[nx][ny] = true;
					que.add(new int[] { nx, ny, date + 1 });
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				
			}
		}
		System.out.println(day);
		return;
	}

	public static boolean isIn(int x, int y) {
		return (x >= 0 && x < n && y >= 0 && y < m);
	}
	
	
}