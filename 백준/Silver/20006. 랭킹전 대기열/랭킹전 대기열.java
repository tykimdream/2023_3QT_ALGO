import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static class Player{
        int lv;
        String id;
        public Player(int lv, String id){
            this.lv = lv;
            this.id = id;
        }
    }

    public static class Room {
        int roomNo, stdLv;
        PriorityQueue<Player> players;
        public Room(int roomNo, int stdLv, Player player){
            this.roomNo = roomNo;
            this.stdLv = stdLv;
            players = new PriorityQueue<>(new Comparator<Player>() {
                @Override
                public int compare(Player o1, Player o2) {
                    return o1.id.compareTo(o2.id);
                }
            });
            this.players.add((player));
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int roomNo = 0;

        ArrayList<Room> list= new ArrayList<>();

        for(int i = 0; i < p; i++){
            st = new StringTokenizer(br.readLine());
            int lv = Integer.parseInt(st.nextToken());
            String id = st.nextToken();
            boolean isIn = false;
            for(Room room : list){
                if(room.players.size() < m && Math.abs(room.stdLv - lv) <= 10){
                    room.players.add(new Player(lv, id));
                    isIn = true;
                    break;
                }
            }
            if(isIn == false){
                list.add(new Room(roomNo++, lv, new Player(lv, id)));
            }
        }

        for(Room room : list){
            System.out.println(room.players.size() == m ? "Started!" : "Waiting!");
            while(!room.players.isEmpty()){
                Player player = room.players.poll();
                System.out.println(player.lv + " " + player.id);
            }
        }
    }
}