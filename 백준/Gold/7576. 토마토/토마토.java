import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	static int[][] map;
	static boolean[][] visited;
	static int n, m, result;
	static Queue<int[]> que = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) que.offer(new int[] {i, j, 0});
			}
		}
		
		dfs();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == 0) result = -1;
			}
		}
//		print();
		System.out.println(result);
	}
	
	private static void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void dfs() {
		result = 0;
		while(!que.isEmpty()) {
			int[] temp = que.poll();
			int x = temp[0];
			int y = temp[1];
			map[x][y] = 1;
			result = Math.max(result, temp[2]);
//			visited[x][y] = true;
			for(int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if(!isIn(nx, ny) ||  map[nx][ny] == -1 || map[nx][ny]==1 || visited[nx][ny]) continue;
//				if (nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny] == false && map[nx][ny] == 0) {
					visited[nx][ny] = true;
					que.add(new int[] {nx, ny, temp[2]+1});
					
//				}
			}
		}
	}
	
	public static boolean isIn(int x, int y) {
		return (x>=0 && x < n && y >= 0 && y < m);
	}
}
