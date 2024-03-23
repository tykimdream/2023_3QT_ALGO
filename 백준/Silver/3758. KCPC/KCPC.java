import java.util.*;

public class Main {
	public static class Team {
		int teamNum, submitCount, score, lastSubmitTime;
		int[] scoreList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int myId = sc.nextInt();
			int M = sc.nextInt();
			Team[] teams = new Team[n];

			for (int m = 0; m < M; m++) {
				int id = sc.nextInt();
				int j = sc.nextInt();
				int s = sc.nextInt();
				if (teams[id - 1] == null) {
					teams[id - 1] = new Team();
					teams[id - 1].teamNum = id;
					teams[id - 1].scoreList = new int[k + 1];
				}
				teams[id - 1].scoreList[j] = Math.max(s, teams[id - 1].scoreList[j]);
				teams[id - 1].submitCount++;
				teams[id - 1].lastSubmitTime = m;
			}

			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 1; j < k + 1; j++) {
					sum += teams[i].scoreList[j];
				}
				teams[i].score = sum;
			}
			
			Arrays.sort(teams, new Comparator<Team>() {
				@Override
				public int compare(Team o1, Team o2) {

					if (o1.score == o2.score) {
						if (o1.submitCount == o2.submitCount) {
							// 제출횟수는 적은게 좋다.
							return o1.lastSubmitTime - o2.lastSubmitTime;
						}
						return o1.submitCount - o2.submitCount;
					}
					return o2.score - o1.score;// 점수는 높은게 좋다.
				}
			});

			for (int i = 0; i < n; i++) {
				if (teams[i].teamNum == myId) {
					System.out.println(i + 1);
				}
			}
		}
	}
}