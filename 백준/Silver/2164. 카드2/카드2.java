import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			que.add(i);
		}
		
		while(que.size() > 1) {
			que.poll();
			int t = que.poll();
			que.add(t);
		}
		System.out.println(que.peek());
	}

}