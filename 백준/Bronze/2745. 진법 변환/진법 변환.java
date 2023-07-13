import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int len = N.length();
        int answer = 0;
        int bias = 0;
        // 전처리
        for(int i = len - 1; i >= 0; i--){
            int value;
            if(N.charAt(i) >= 'A' && N.charAt(i) <= 'Z'){
                value = N.charAt(i) - 'A' + 10;
            } else{
                value = Integer.parseInt(N.charAt(i) + "");
            }
            answer += value * Math.pow(B, bias);
            bias++;
        }
        System.out.println(answer);

        // 123
        // 3 : 3 * 10^0 = 3
        // 2 : 2 * 10^1 = 20
        // 1 : 1 * 10^2 = 100

        // B = 36
        // ABCDE
        // E : 14 * 36^0
        // D : 13 * 36^1
//        1011101
        // 1 * 2^0 = 1
        // 0 * 2^1 = 0
        // 1 * 2^2 = 4
        //....
    }

}