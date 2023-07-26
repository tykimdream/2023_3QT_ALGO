import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 정수 3개 입력 받기
		// 가장 맛있는 칵테일 : 홀수이며 가장큰 수 > 홀수 > 가장 큰 짝수 > 짝수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		boolean flag = false;
		int odd = 1;
		int even = 1;
		for (int i = 0; i < 3; i++) { // 배열에 입력 받은 수 넣어 주기
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] % 2 != 0) {// 홀수면 odd에 곱해준다
				odd *= arr[i];
				flag = true;
			} else {// 짝수면 even에 값을 곱해준다
				even *= arr[i];
			}
		}
		if (flag) {// odd = 1은 홀수가 없다는 말이므로 모든수를 곱한 짝수 값 출력
			System.out.print(odd);
		} else {// 홀수가 어떤 짝수보다 맛잇는 칵테일을 만드므로 odd가 1이아니면 odd 출력
			System.out.print(even);
		}
	}
}