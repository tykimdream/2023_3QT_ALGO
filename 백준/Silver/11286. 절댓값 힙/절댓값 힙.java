import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		PriorityQueue<Integer> pq;

		/// functional interface 는 lambda로 표현할 수 이싿.
		pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (Math.abs(o1) == Math.abs(o2))
					return o1 - o2;
				else
					return Math.abs(o1) - Math.abs(o2);
			}
		});

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input == 0) {
				if (pq.size() > 0)
					sb.append(pq.poll());
				else
					sb.append(0);
				sb.append("\n");
			} else
				pq.add(input);
		}
		System.out.println(sb);
	}

}
