import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int[] room = new int[m];

		st= new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			room[i] = Integer.parseInt(st.nextToken());
		}
		
		st= new StringTokenizer(br.readLine());
		int main = Integer.parseInt(st.nextToken());
		int sub = Integer.parseInt(st.nextToken());
		
		long ans = 0;
		for(int i = 0; i < m; i++) {
			room[i] -= main;
			ans++;
			if(room[i] > 0) {
				ans += room[i] / sub;
				if(room[i] % sub != 0) ans++;
			}
		}
		System.out.println(ans);
		
	}
}