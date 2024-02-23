import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long result = 1;
        HashSet<Long> arr = new HashSet<Long>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            long t = Long.parseLong(st.nextToken());
            BigInteger s = BigInteger.valueOf(t);
            if(s.isProbablePrime(10) == true){
                arr.add(t);
            }
        }
        for(Long t : arr){
            result *= t;
        }
        System.out.println(result == 1 ? -1 : result );
    }
}