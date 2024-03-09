import java.util.*;

public class Main {
    static int[] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int stu = sc.nextInt();

        for(int i = 0; i < stu; i++){
            int type = sc.nextInt();
            int index = sc.nextInt();

            switch(type){
                case 1:
                    boy(index);
                    break;
                case 2:
                    girl(index - 1);
                    break;
            }

        }

        for (int k = 0; k < n; k++) {
            if(k % 20 == 0 && k!= 0)
                System.out.println();
            System.out.print(arr[k] + " ");
        }

    }

    static void boy(int num){
        for (int j = 1; j * num <= n; j++) {
            arr[j * num - 1] ^= 1;
        }
    }

    static void girl(int index){
        arr[index] ^= 1;
        for(int i = 1; i < n; i++){
            if(index + i < n && index - i >= 0 && arr[index + i] == arr[index - i]){
                arr[index + i] ^= 1;
                arr[index - i] ^= 1;
            } else{
                break;
            }
        }
    }
}