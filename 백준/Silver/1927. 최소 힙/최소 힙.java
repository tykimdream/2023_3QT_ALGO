import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Comparator comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		PriorityQueue<Integer> que = new PriorityQueue<>(comparator);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if(input == 0) {
				if(que.isEmpty()) {
					sb.append("0\n");
				} else {
					sb.append(que.poll() + "\n");
				}
			} else {
				que.add(input);
			}			
		}
		System.out.println(sb.toString());
	}
}