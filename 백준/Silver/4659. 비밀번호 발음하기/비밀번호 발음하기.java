import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String[] moArr = { "a", "e", "i", "o", "u" };
		String mo = "aeiou";

		boolean isAcceptable;
		Scanner sc = new Scanner(System.in);
		while (true) {
			String word = sc.next();
			if (word.equals("end"))
				break;

			sb.append("<" + word + "> is ");
			isAcceptable = false;

			for (String x : moArr) {
				if (word.contains(x))
					isAcceptable = true;
			}

			for (int i = 0, len = word.length(); i < len - 1; i++) {
				char t1 = word.charAt(i);
				char t2 = word.charAt(i + 1);
				if (t1 == t2 && t1 != 'o' && t1 != 'e') {
					isAcceptable = false;
					break;
				}
				if (i < len - 2) {
					char t3 = word.charAt(i + 2);
					if (mo.contains(t1 + "") && mo.contains(t2 + "") && mo.contains(t3 + "")) {
						isAcceptable = false;
						break;
					}
					if (mo.contains(t1 + "") == false && mo.contains(t2 + "") == false
							&& mo.contains(t3 + "") == false) {
						isAcceptable = false;
						break;
					}
				}
			}
			if (isAcceptable == false) {
				sb.append("not acceptable.\n");
			} else {
				sb.append("acceptable.\n");
			}

		}
		System.out.println(sb.toString());
	}

}