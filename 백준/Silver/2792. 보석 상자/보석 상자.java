import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] jul = new int[m];
			int left = 1, right = 0, mid, ans = 0;;
			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				jul[i] = Integer.parseInt(st.nextToken());
				right = Math.max(jul[i], right);
			}
			
			while(left <= right) {
				// mid : 질투심 max, 이 mid가 적합한지 찾는 이분 탐색 진행
				mid = (left + right) / 2;
				int getJul = 0;
				for(int i = 0; i < m; i++) {
					getJul += jul[i] / mid;
					// 다 나눠줬는데 남은게 있으면 남은 양은 한 사람에게 몰아주기
					if(jul[i] % mid != 0) getJul++;
				}
				if(getJul > n) {
					// 사람 당 줘야하는 보석의 수를 늘린다.
					left = mid + 1;
				} else {
					// 사람 당 줘야하는 보석의 수를 줄인다.
					right = mid -1;
					ans = mid;
				}
			}
			System.out.println(ans);
	}
}