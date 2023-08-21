import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int time = Integer.parseInt(st.nextToken());
		
		min += time;
		if(min >= 60) {
			int temp = min / 60;
			hour += temp;
			min %= 60;
		}
		hour %= 24;
		System.out.println(hour + " " + min);
	}

}