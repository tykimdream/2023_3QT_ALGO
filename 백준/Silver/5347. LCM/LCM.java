import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int loop = Integer.parseInt(st.nextToken());
		for(int i = 0; i < loop; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long min = Math.min(a, b);
			long max = Math.max(a, b);
			
			long GCD = getGCD(max, min);
			long LCM = (max * min) / GCD;
			System.out.println(LCM);
		}
		
	}
	
	public static long getGCD(long max, long min) {
		if(max % min == 0) {
			return min;
		}
		return getGCD(min, max % min);
	}
}