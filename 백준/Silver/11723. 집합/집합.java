import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String order = "";
		int num = 0;
		int n = sc.nextInt();
		int bit = 0;
		for(int i = 0; i < n; i++) {
			order = sc.next();
			switch(order) {
			case "add":
				num = sc.nextInt();
				bit = bit | (1 << num);
				break;
			case "remove":
				num = sc.nextInt();
				bit = bit & ~(1 << num);
				break;
			case "check":
				num = sc.nextInt();
				sb.append((bit & (1 << num)) == 0? "0" : "1");
				sb.append("\n");
				break;
			case "toggle":
				num = sc.nextInt();
				bit = bit ^ (1 << num);
				break;
			case "all":
				bit = (1 << 21) - 1;
				break;
			case "empty":
				bit = 0;
				break;
			}
			
		}
		System.out.println(sb.toString());
		
	}
}