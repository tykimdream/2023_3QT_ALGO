import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] N = new int[size];

        for (int i = 0; i < size; i++) {
            N[i] = scanner.nextInt();
        }

        int count = 0;
        for (int k = 0; k < size; k++) {
            int flag = 1; // flag 변수를 각 숫자마다 초기화
            if (N[k] == 2) {
                count += 1;
            } else if (N[k] > 2) { // 2보다 큰 경우만 소수 판별 수행
                for (int j = 2; j <= N[k] - 1; j++) {
                    if (N[k] % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    count += 1;
                }
            }
        }
        System.out.print(count);
    }
}