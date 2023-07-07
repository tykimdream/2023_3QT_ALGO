import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];

        // 여러개를 입력 받기에 StringTokenizer를 통해 분리 해준다
        StringTokenizer st = new StringTokenizer(br.readLine());

       for (int i = 0; i < n; i++) {
           arr[i] =Integer.parseInt((st.nextToken()));
       }
       
       Arrays.sort(arr);
       
       int min = arr[0];
       
       for(int i = 1; i <= min; i++) {
    	   boolean flag = true;
    	   for(int t = 0; t < arr.length; t++) {
    		   if(arr[t] % i != 0) {
    			   flag = false;
    			   break;
    		   }
    	   }
    	   if(flag) {
    		   System.out.println(i);
    	   }
       }
        
	}
}