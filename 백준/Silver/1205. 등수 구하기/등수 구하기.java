import java.io.*;
import java.util.*;

/**
 * @author tykimdream
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		int[] list = new int[n];
		if(n > 0)
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 1;
		
		if(n == p && t <= list[n-1]) {
			System.out.println(-1);
		} else {
			for(int i = 0; i < n; i++) {
				if(t < list[i]) ans++;
				else break;
			}
			System.out.println(ans);
		}
				
	}

}