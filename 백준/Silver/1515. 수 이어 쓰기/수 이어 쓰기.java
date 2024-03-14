import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		int length = input.length();
		int N = 0;
		int pos = 0;

		while (true) {
			N++;
			String cur = Integer.toString(N);

			for (int i = 0, len = cur.length(); i < len; i++) {
				if(cur.charAt(i) == input.charAt(pos)) {
					pos++;
				}
				if (pos == length) {
					System.out.println(N);
					return;
				}
			}
		}
		
	}

}