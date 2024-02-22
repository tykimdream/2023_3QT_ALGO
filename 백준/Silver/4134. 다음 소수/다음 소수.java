import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			BigInteger t = sc.nextBigInteger();
			if(t.isProbablePrime(10)) {
				System.out.println(t);
			} else {
				System.out.println(t.nextProbablePrime());
			}
			
		}
	}
	
}