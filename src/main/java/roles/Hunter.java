package roles;

import main.Main;

public class Hunter implements Role {
    int affectedPlayer;

    @Override
    public String getName() {
        return "Hunter";
    }

    @Override
    public int getActionCount() {
        return 1;
    }

    @Override
    public void setAffectedPlayer(int playerId) {

    }

    @Override
    public void runAction(int action) {
        if (action == 0) {
            Main.players.stream().filter(player -> player.id == affectedPlayer).findFirst().ifPresent(player -> {
                if (!player.isDead) player.isDead = true;
            });
        }
    }
}
