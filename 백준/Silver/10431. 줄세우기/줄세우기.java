import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		for(int t = 0; t < n; t++) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken() + " ");
			int count = 0;
			int current = 0;
			List<Integer> line = new ArrayList<>();
			
			for(int i = 0; i < 20; i++) {
				current = Integer.parseInt(st.nextToken());
				for(int front : line) {
					if(front > current) {
						count++;
					}
				}
				line.add(current);
			}
			
			sb.append(count);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}