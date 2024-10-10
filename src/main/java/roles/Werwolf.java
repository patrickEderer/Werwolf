package roles;

import java.util.HashMap;
import java.util.Map;

public class Werwolf implements Role {
    static Map<Integer, Integer> votes = new HashMap<>();
    int affectedPlayer;

    @Override
    public String getName() {
        return "Werwolf";
    }

    @Override
    public int getActionCount() {
        return 1;
    }

    @Override
    public void setAffectedPlayer(int playerId) {
        affectedPlayer = playerId;
    }

    @Override
    public void runAction(int action) {
        if (action == 0) {
            if (!votes.containsKey(affectedPlayer)) {
                votes.put(affectedPlayer, 1);
            } else {
                votes.put(affectedPlayer, votes.get(affectedPlayer) + 1);
            }
        }
    }
}
