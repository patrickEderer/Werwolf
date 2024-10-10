package roles;

import main.Main;

public class Seher implements Role {
    int affectedPlayer;

    @Override
    public String getName() {
        return "Seher";
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
            Main.players.stream().filter(player -> player.id == affectedPlayer).findFirst().ifPresent(player -> {
                System.out.println("The players role is: " + player.role.getName());
            });
        }
    }
}
