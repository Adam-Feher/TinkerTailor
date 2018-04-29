import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {

    public void play(int N, int K) {
     List<Integer> players = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            players.add(i+1);
        }
        Iterator playersIt = players.iterator();

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < K; j++) {
                if (playersIt.hasNext()) {
                    playersIt.next();
                }
                else {
                playersIt = players.iterator();
                playersIt.next();
                }
            }
            playersIt.remove();
        }
        System.out.println(players);
    }
}

