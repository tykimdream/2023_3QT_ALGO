import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());

		if(n == 1) {
			System.out.println(2);
			return;
		}
		
		while(true) {
			if(isPrime(n) && isPal(n)) {
				System.out.println(n);
				return;
			}
			n++;
		}
		
	}
	public static boolean isPrime(int n) {		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	public static boolean isPal(int n) {
		String original = n + "";
		String reverse = "";
		
		for(int i = original.length() - 1 ; i >= 0; i--) {
			reverse += original.charAt(i) + "";
		}
		
		if(original.equals(reverse)) return true;
		
		return false;
	}
	
}