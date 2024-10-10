package roles;

import main.Main;

public class Dieb implements Role {
    int affectedPlayer;

    @Override
    public String getName() {
        return "Dieb";
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
            Main.players.stream().filter(player -> player.id == affectedPlayer).findFirst().ifPresent(player -> player.role = this);
        }
    }
}
