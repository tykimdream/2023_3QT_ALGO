import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int safeCount = Integer.MAX_VALUE;
	static int[] num;
	static int[][] cctv;
	static int[][] map;
	static int size, n, m; // CCTV 갯수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] >= 1 && map[i][j] <= 5)
					size++;
			}
		}

		num = new int[size];
		cctv = new int[size][3]; // CCTV 종류, x, y 좌표 저장
		int idx = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] >= 1 && map[i][j] <= 5) {
					cctv[idx][0] = map[i][j];
					cctv[idx][1] = i;
					cctv[idx][2] = j;
					idx++;
				}
			}
		}
		perm(0);
		System.out.println(safeCount);
	}

	private static void perm(int cnt) {
		// TODO Auto-generated method stub
		if (cnt == size) {
			// 수열이 완성됨
			// num 배열에는 각 CCTV가 보는 방향을 가르킨다.
			// 0 : 상(0), 1 : 우(90), 2 : 하(180), 3 : 좌(270)
//			System.out.println(Arrays.toString(num));
			int[][] tempMap = new int[n][m];
			for (int i = 0; i < map.length; i++) {
				System.arraycopy(map[i], 0, tempMap[i], 0, map[i].length);
			}

			for (int i = 0; i < num.length; i++) {
				surveillance(tempMap, num, cctv, i);
			}
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < m; j++) {
//					System.out.print(tempMap[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
			count(tempMap);
			return;
		}
		for (int i = 0; i < 4; i++) {
			num[cnt] = i;
			perm(cnt + 1);
		}

	}

	public static void right(int[][] tempMap, int x, int y) {
		int t = 1;
		while (true) {
			if (y + t < m && tempMap[x][y + t] != 6) {
				tempMap[x][y + t] = 9;
			} else
				break;
			t++;
		}
	}

	public static void left(int[][] tempMap, int x, int y) {
		int t = 1;
		while (true) { // 왼쪽
			if (y - t >= 0 && tempMap[x][y - t] != 6) {
				tempMap[x][y - t] = 9;
			} else
				break;
			t++;
		}
	}

	public static void bottom(int[][] tempMap, int x, int y) {
		int t = 1;
		while (true) { // 하단
			if (x + t < n && tempMap[x + t][y] != 6) {
				tempMap[x + t][y] = 9;
			} else
				break;
			t++;
		}
	}

	public static void top(int[][] tempMap, int x, int y) {
		int t = 1;
		while (true) {
			if (x - t >= 0 && tempMap[x - t][y] != 6) {
				tempMap[x - t][y] = 9;
			} else
				break;
			t++;
		}
	}

	private static void surveillance(int[][] tempMap, int[] degree, int[][] cam, int del) {
		// TODO Auto-generated method stub

		int x = cam[del][1];
		int y = cam[del][2];
		int t = 1;
		// 1번 카메라 경우
		if (cam[del][0] == 1) {
			if (degree[del] == 0) {
				right(tempMap, x, y);
			} else if (degree[del] == 1) {
				left(tempMap, x, y);
			} else if (degree[del] == 2) {
				bottom(tempMap, x, y);
			} else if (degree[del] == 3) {
				top(tempMap, x, y);
			}
		} else if (cam[del][0] == 2) { // 2번 카메라의 경우
			if (degree[del] == 0 || degree[del] == 2) { // 좌 우
				left(tempMap, x, y);
				right(tempMap, x, y);
			} else if (degree[del] == 1 || degree[del] == 3) { // 상하
				top(tempMap, x, y);
				bottom(tempMap, x, y);
			}
		} else if (cam[del][0] == 3) { // 3번 카메라의 경우
			if (degree[del] == 0) { // 상 우
				top(tempMap, x, y);
				right(tempMap, x, y);
			} else if (degree[del] == 1) { // 우 하
				right(tempMap, x, y);
				bottom(tempMap, x, y);
			} else if (degree[del] == 2) { // 하 좌
				bottom(tempMap, x, y);
				left(tempMap, x, y);
			} else if (degree[del] == 3) { // 좌 상
				left(tempMap, x, y);
				top(tempMap, x, y);
			}

		} else if (cam[del][0] == 4) { // 4번 카메라의 경우
			if (degree[del] == 0) { // 좌 상 우
				left(tempMap, x, y);
				top(tempMap, x, y);
				right(tempMap, x, y);
			} else if (degree[del] == 1) { // 상 우 하
				top(tempMap, x, y);
				right(tempMap, x, y);
				bottom(tempMap, x, y);
			} else if (degree[del] == 2) { // 우 하 좌
				right(tempMap, x, y);
				bottom(tempMap, x, y);
				left(tempMap, x, y);
			} else if (degree[del] == 3) { // 하 좌 상
				bottom(tempMap, x, y);
				left(tempMap, x, y);
				top(tempMap, x, y);
			}
		} else if (cam[del][0] == 5) {
			bottom(tempMap, x, y);
			left(tempMap, x, y);
			top(tempMap, x, y);
			right(tempMap, x, y);
		}

	}

	public static void count(int[][] arr) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0)
					count++;
			}
		}
		safeCount = Math.min(safeCount, count);
	}

}