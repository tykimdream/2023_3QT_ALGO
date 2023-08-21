import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		String[][] map = new String[n][n];
		
		for(int i = 0; i < n; i++) {
			map[i] = br.readLine().split("");
		}
		
		int count_r = 0;
		int count_c = 0;
		
		// 가로 방향 탐색
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j].equals(".")) {
					if(j + 1 < n && map[i][j + 1].equals(".") && (j + 2 >= n || map[i][j+2].equals("X"))) {
						count_r++;
					}
				}
			}
		}
		
		// 세로 방향 탐색
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(map[j][i].equals(".")) {
					if(j + 1 < n && map[j + 1][i].equals(".") && (j + 2 >= n || map[j+2][i].equals("X"))) {
						count_c++;
					}
				}
			}
		}
		System.out.println(count_r + " " + count_c);
	}
	
}