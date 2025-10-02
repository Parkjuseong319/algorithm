import java.io.*;
import java.util.*;

public class Main {
    static class Player {
        int level;
        String nick;
        Player(int level, String nick) {
            this.level = level;
            this.nick = nick;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 입력 순서 유지
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String nick = st.nextToken();
            players.add(new Player(level, nick));
        }

        // 방: 첫 플레이어 레벨 저장, 닉네임 저장
        ArrayList<Integer> firstLevels = new ArrayList<>();
        ArrayList<ArrayList<Player>> rooms = new ArrayList<>();

        for (Player player : players) {
            boolean flag = false;

            for (int i = 0; i < rooms.size(); i++) {
                int firstLevel = firstLevels.get(i);
                if (rooms.get(i).size() < n &&
                        player.level >= firstLevel - 10 &&
                        player.level <= firstLevel + 10) {
                    rooms.get(i).add(player);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                firstLevels.add(player.level);
                rooms.add(new ArrayList<>());
                rooms.get(rooms.size() - 1).add(player);
            }
        }

        // 출력
        for (ArrayList<Player> room : rooms) {
            if (room.size() == n) {
                bw.write("Started!\n");
            } else {
                bw.write("Waiting!\n");
            }
            room.sort(Comparator.comparing(p1 -> p1.nick));
            for (Player p1 : room) {
                bw.write(p1.level + " " + p1.nick + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
