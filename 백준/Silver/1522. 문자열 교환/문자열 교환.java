import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		char[] input = x.toCharArray();
		
		int len = x.length();
		int cnt = 0;
		for(char ch : input) {
			if(ch == 'a') cnt++;
		}
		
		int bCnt = Integer.MAX_VALUE;
		
		for(int i = 0; i < len; i++) {
			int localCnt = 0;
			for(int j = 0; j < cnt; j++) {
				if(input[(i + j) % len] == 'b') {
					localCnt++;
				}
			}
			bCnt = Math.min(localCnt, bCnt);
		}
		System.out.println(bCnt);
	}

}