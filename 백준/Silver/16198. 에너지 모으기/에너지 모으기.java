import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,  ans;
    static int[] energy, order;
    static  ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        energy = new int[n];


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        // 줄여가면서 뽑을 구슬의 인덱스를 수열로 만든다.
        order = new int[n - 2];
        perm(0, 0, n);
        System.out.println(ans);
    }

    public static void perm(int cnt, int index, int len){
        if(len == 2){
            // 작업 시작
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < n; i++){
                temp.add(list.get(i));
            }
            int local = 0;
            for(int i = 0; i < order.length; i++){
                local += temp.get(order[i] - 1) * temp.get(order[i] + 1);
//
                temp.remove(order[i]);
            }
            ans = Math.max(ans, local);
            return;
        }
        for(int i = 1; i < len - 1; i++){
            order[cnt] = i;
            perm(cnt + 1, i + 1, len -1);
        }
    }
}