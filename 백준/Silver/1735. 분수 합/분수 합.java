import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int s2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		
		int s = s1*m2 + s2*m1;
		int m = m1*m2;
		
//		System.out.println(s + " / " + m);
		int temp = 1;
		for(int i = 1; i <= s && i <= m;i++) {
			if(s%i==0 && m%i==0) {
				temp = i;
			}
		}
		System.out.println((s/temp) + " " + (m/temp));
	}
}