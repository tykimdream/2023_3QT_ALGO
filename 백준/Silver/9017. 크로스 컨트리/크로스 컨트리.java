import java.sql.Array;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static class Team{
         int teamNum;
         int score;
         int fifthPlayer;

        public Team(int teamNum, int score, int fifthPlayer) {
            this.teamNum = teamNum;
            this.score = score;
            this.fifthPlayer = fifthPlayer;
        }


    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t = 0; t < T; t++){
            int size = sc.nextInt();

            List<Integer> arr = new LinkedList<>();
            Set<Integer> teams = new HashSet<>();
            List<Integer> naTeam = new ArrayList<>();

            // 성적을 입력하고, 구분되는 팀을 teams에 넣는다.
            for(int i = 0; i < size; i++){
                int input = sc.nextInt();
                arr.add(input);
                teams.add(input);
            }

            // 6명 미만으로 접수된 팀을 탈락 팀에 넣는다.
            for(int team : teams){
                int count = 0;
                for(int a : arr){
                    if(a == team) count++;
                }
                if(count < 6){
                    naTeam.add(team);
                }
            }

            // 탈락된 팀들을 성적표와 팀 리스트에서 제거한다.
            for(int p : naTeam){
                teams.remove(p);
                arr.removeIf(Predicate.isEqual(p));
            }

            // 성적을 종합한다.
            // 총 점, 5번째 주자가 나오는 시점
            List<Team> list = new ArrayList<>();
            List<Team> finalList = new ArrayList<>();

//            for (int x : arr){
//                System.out.print(x + " ");
//            }
//            System.out.println();

            for(int team : teams){
                int idx = 1;
                int sum = 0;
                int count = 1;
                int fifth = 0;
//                System.out.println("team " + team);
                for(int p : arr){
                    if(p == team){
                        if(count < 5){
                            sum += idx;
                        } else if (count == 5){
                            fifth = idx;
                            break;
                        }
//                        System.out.println(sum + " " + idx + " " + count);
                        count++;
                    }
                    idx++;
                }
                list.add(new Team(team, sum, fifth));
            }

            list.sort((o1, o2) -> o1.score - o2.score);
            int max = list.get(0).score;

            for(Team team : list){
                if(team.score == max){
                    finalList.add(team);
                } else {
                    break;
                }
            }
            finalList.sort((o1, o2) -> o1.fifthPlayer - o2.fifthPlayer);

//            System.out.println("Teams List");
//            for(Team team : finalList){
//                System.out.println(team.teamNum + " " + team.score + " " + team.fifthPlayer);
//            }

//            System.out.println(finalList.get(0).teamNum);
                sb.append(finalList.get(0).teamNum + "\n");
        }
        System.out.print(sb.toString());
    }
}