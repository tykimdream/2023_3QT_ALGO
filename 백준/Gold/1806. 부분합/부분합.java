import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		int[] nums = new int[n];
		
		long sum = 0;
		int len = 0, answer = Integer.MAX_VALUE, head = 0, tail = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			if(nums[i] == m) answer = 1;
		}
		
		for(int i = 0; i < n; i++) {
			sum += nums[i];
			head++;
			while(sum > m && sum - nums[tail] >= m) {
				sum -= nums[tail];
				tail++;
			}
			if(sum >= m) {
				answer = Math.min(answer, head - tail);	
			}
		}
		if(answer == Integer.MAX_VALUE) System.out.println(0);
		else System.out.println(answer);
	}
}