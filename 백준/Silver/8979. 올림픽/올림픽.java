import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] country = new int[n][5];
		PriorityQueue<int[]> pq;
		pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					if (o1[2] == o2[2]) {
						if (o1[3] == o2[3]) {
							return o2[4] - o1[4];
						}
						return o2[3] - o1[3];
					} else {
						return o2[2] - o1[2];
					}
				} else {
					return o2[1] - o1[1];
				}
			}
		});

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			pq.add(new int[] { i + 1, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}

		for (int i = 1; i < n + 1; i++) {
			int[] temp = pq.poll();
//			System.out.println("id : " + temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3] + " " + temp[4] + " ");
			if(i == m) {
				System.out.println(temp[0]);
				return;
			}
		}

	}
}