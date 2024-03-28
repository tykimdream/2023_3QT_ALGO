import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<String> memo = new HashSet<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			memo.add(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i= 0; i < m;i++) {
			st = new StringTokenizer(br.readLine());
			String[] temp = st.nextToken().split(",");
			for(String x :temp) {
				memo.remove(x);
			}
			sb.append(memo.size() + "\n");
		}
		System.out.println(sb.toString());
		
	}

}