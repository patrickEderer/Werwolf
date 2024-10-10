package roles;

import main.Main;

public class Hexe implements Role {
    int affectedPlayer;

    @Override
    public String getName() {
        return "Hexe";
    }

    @Override
    public int getActionCount() {
        return 2;
    }

    @Override
    public void setAffectedPlayer(int playerId) {
        affectedPlayer = playerId;
    }

    @Override
    public void runAction(int action) {
        Main.players.stream().filter(player -> player.id == affectedPlayer).findFirst().ifPresent(player -> {
            if (action == 0) {
                if (player.willDie) player.willDie = false;
            } else if (action == 1) {
                if (!player.willDie) player.willDie = true;
            }
        });

    }
}
