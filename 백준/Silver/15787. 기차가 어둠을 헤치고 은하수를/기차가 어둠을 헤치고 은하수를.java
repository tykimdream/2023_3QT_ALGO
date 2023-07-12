import java.util.*;
import java.io.*;

public class Main {
	static int [] trains;
	public static void main(String[] args) throws IOException {
		HashSet<Integer> set = new HashSet<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		trains = new int[n + 1];
		int seat;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			switch (op) {
			case 1:
				seat = Integer.parseInt(st.nextToken()) - 1;
				trains[num] |= 1 << seat;
				break;
			case 2:
				seat = Integer.parseInt(st.nextToken()) - 1;
				trains[num] &= ~(1 << seat);
				break;
			case 3:
				trains[num] = (trains[num] & ~(1 << 19)) << 1;
				break;
			case 4:
				trains[num] = (trains[num] & ~(1 << 0)) >> 1;
				break;
			}
//			print();
		}

		for (int i = 1; i <= n; i++) {
			set.add(trains[i]);
		}
		
		System.out.println(set.size());
	}
	private static void print() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Integer.toBinaryString(trains[i]));
		}
		System.out.println("--------------");
	}
	

}