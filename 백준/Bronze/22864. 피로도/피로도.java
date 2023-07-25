import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// A-피로도 B-처리양 C-줄어드는 피로도 M-최대 피로도
		// 최대 피로도가 되면 휴식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int work = 0; // 일한 양
		int t = 0; // 누적 피로도
		
		for (int i = 0; i < 24; i++) {
			if (t + A <= M) { // 일 진행
				work += B;
				t += A;
			} else { // 휴식
				t -= C;
				if (t < 0)
					t = 0;
			}
		}
		System.out.print(work);
	}
}