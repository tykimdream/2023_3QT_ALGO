import java.util.*;

public class Main {
	static List<Character> alpha = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] first = sc.next().toCharArray();

		Map<Character, Integer> std = new HashMap<>();
		for (char x : first) {
			if (std.containsKey(x)) {
				int count = std.get(x) + 1;
				std.put(x, count);
			} else {
				std.put(x, 1);
			}
		}
		std.put('-', first.length);

		for (int i = 0; i < 26; i++) {
			alpha.add((char) ('A' + i));
		}

		List<Map<Character, Integer>> dic = new LinkedList<>();

		for (int i = 1; i < n; i++) {
			char[] temp = sc.next().toCharArray();
			Map<Character, Integer> input = new HashMap<>();
			for (char x : temp) {
				if (input.containsKey(x)) {
					int count = input.get(x) + 1;
					input.put(x, count);
				} else {
					input.put(x, 1);
				}
			}
			input.put('-', temp.length);
			dic.add(input);
		}

		int count = 0;
		for (Map<Character, Integer> map : dic) {
			count = simCheck(std, map) == true ? count + 1 : count;
		}

		System.out.println(count);
	}

	public static boolean simCheck(Map<Character, Integer> std, Map<Character, Integer> map) {
		int common = 0;
		for (char alpha : alpha) {
			int mapCount = map.getOrDefault(alpha, 0);
			int stdCount = std.getOrDefault(alpha, 0);
			int diff = Math.min(mapCount, stdCount);

			common += diff;
		}

		int stdSize = std.get('-');
		int mapSize = map.get('-');

		if (stdSize == mapSize) {
			if (common == mapSize || common == mapSize - 1)
				return true;
		} else if (stdSize == mapSize + 1) {
			if (mapSize == common)
				return true;
		} else if (stdSize == mapSize - 1) {
			if (stdSize == common)
				return true;
		}

		return false;
	}
}