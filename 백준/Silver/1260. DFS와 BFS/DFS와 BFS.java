import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, V;
	static boolean[][] matrix;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		matrix = new boolean[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int dep = Integer.parseInt(st.nextToken());
			int des = Integer.parseInt(st.nextToken());
			matrix[dep][des] = matrix[des][dep] = true;
		}

		visited = new boolean[N + 1];
		sb.append(V + " ");
		visited[V] = true;
		dfs(V);
		sb.append("\n");

		visited = new boolean[N + 1];
		sb.append(V + " ");
		visited[V] = true;
		bfs(V);
		System.out.println(sb.toString());
	}

	private static void dfs(int node) {
		// v에서 시작한다.
		for (int i = 1; i <= N; i++) {
			if (matrix[node][i] && visited[i] == false) {
				sb.append(i + " ");
				visited[i] = true;
				dfs(i);
			}
		}

	}

	private static void bfs(int node) {
		// v에서 시작한다.
		Queue<Integer> que = new LinkedList<>();
		que.add(node);

		while (que.isEmpty() == false) {
			int cur = que.poll();
			for (int i = 1; i <= N; i++) {
				if (matrix[cur][i] && visited[i] == false) {
					sb.append(i + " ");
					visited[i] = true;
					que.add(i);
				}
			}
		}
	}

}