import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		for(int t = 0; t < T; t++) {
			String input = scanner.next();
			int acc = 1;
			int score = 0;
			for(int i = 0; i < input.length();i++) {
				if(input.charAt(i) == 'O') {
					score = score + acc;
					acc++;
				}else {
					acc = 1;
				}
			}
			System.out.println(score);
		}
	}

}