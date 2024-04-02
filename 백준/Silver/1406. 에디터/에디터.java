import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		char[] input = st.nextToken().toCharArray();
		int line = Integer.parseInt(br.readLine());

		Stack<String> leftStack = new Stack<>();
		Stack<String> rightStack = new Stack<>();

		for (char c : input) {
			leftStack.add(c + "");
		}

		for (int t = 0; t < line; t++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
			case "L":
				if (leftStack.isEmpty() == false)
					rightStack.add(leftStack.pop());
				break;
			case "D":
				if (rightStack.isEmpty() == false)
					leftStack.add(rightStack.pop());
				break;
			case "B":
				if (leftStack.isEmpty() == false)
					leftStack.pop();
				break;
			case "P":
				leftStack.add(st.nextToken());
				break;
			}
		}
		
		while (leftStack.isEmpty() == false) {
			rightStack.add(leftStack.pop());
		}
		while (rightStack.isEmpty() == false) {
			sb.append(rightStack.pop());
		}
		
		System.out.println(sb.toString());
	}
}