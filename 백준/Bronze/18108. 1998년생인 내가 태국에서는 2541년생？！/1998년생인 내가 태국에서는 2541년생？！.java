import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());	// 반환 된 문자열을 정수로 바꿔줌
		
		System.out.println(year - 543);
	}
}