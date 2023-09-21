import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		System.out.print("<");
		int count = 0;
		
		while(list.size() > 1) {
			count = ((count + k - 1)) % list.size(); 
			System.out.print(list.get(count) + ", ");
			list.remove(count);
		}
		System.out.print(list.get(0) + ">");
	}
}