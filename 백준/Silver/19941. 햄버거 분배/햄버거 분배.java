import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt();
        char[] table = sc.next().toCharArray(); 
        int count = 0; 

        for (int i = 0; i < n; i++) {
            if (table[i] == 'P') { 
                for (int j = i - m; j <= i + m; j++) {
                    if (j >= 0 && j < n && table[j] == 'H') { 
                        table[j] = 'E'; 
                        count++;
                        break; 
                    }
                }
            }
        }

        System.out.println(count);
    }
}