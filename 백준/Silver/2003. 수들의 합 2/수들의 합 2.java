import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int sum = 0;
		int tail = 0;
		int head = 0;
		for(int i = 0; i < n; i++) {
			sum += nums[i];
			head = i;
			
			while(sum > m) {
				sum -= nums[tail];
				tail++;				
			}

			if(sum == m) {
				answer++;
			}
			
			
		}
		
		System.out.println(answer);
	}
}