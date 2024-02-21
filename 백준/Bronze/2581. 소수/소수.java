import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		
		primes[0] = false;
		primes[1] = false;
		
		for(int i = 2; i <= Math.sqrt(primes.length); i++) {
			for(int j = i * i; j < primes.length; j+=i) {
				primes[j] = false;
			}
		}

		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = m; i <= n; i++) {
			if(primes[i]) {
				sum += i;
				min = Math.min(min, i);
			}
		}
		
		if(sum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}