import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String GameType = sc.next();
		Set<String> list = new HashSet<>();

		for (int i = 0; i < n; i++) {
			String input = sc.next();
			if(input.equals("임스")) continue;
			list.add(input);
		}
		int players = list.size();
		
		switch (GameType) {
		case "Y":
			if (players > 0) {
				System.out.print(players / 1);
			}
			break;
		case "F":
			if (players > 1) {
				System.out.print(players / 2);
			}
			break;
		case "O":
			if (players > 2) {
				System.out.print(players / 3);
			}
			break;
		}

	}
}