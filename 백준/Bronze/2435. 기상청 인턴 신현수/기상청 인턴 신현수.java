import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] days = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			days[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int answer = 0;
		
		for(int i = 0; i < k; i++) {
			sum += days[i];
		}
		answer = sum;
		
		for(int i = 0; i < n - k; i++) {
			sum -= days[i];
			sum += days[i+k];
			answer = Math.max(answer, sum);
		}
		System.out.println(answer);
		
	}
}