import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int rank = 1;
		int[][] country = new int[n][5];
		int gold = 0, sliver = 0, bronze = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			country[i][0] = Integer.parseInt(st.nextToken());
			country[i][1] = Integer.parseInt(st.nextToken());
			country[i][2] = Integer.parseInt(st.nextToken());
			country[i][3] = Integer.parseInt(st.nextToken());
			if(country[i][0] == m) {
				gold = country[i][1];
				sliver = country[i][2];
				bronze = country[i][3];
			}
		}
		
		Queue<Integer> same = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if(country[i][0] == m) continue;
			if (gold < country[i][1]) {
				rank++;
			} else if (gold == country[i][1]) {
				same.add(i);
			}
		}
		
		if (same.size() > 0) {
			for (int x : same) {
				if(sliver < country[x][2]) {
					rank++;
				}
				if (sliver == country[x][2] && bronze < country[x][3]) {
					rank++;
				}
			}
		}
		System.out.println(rank);

	}

}