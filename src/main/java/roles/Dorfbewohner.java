package roles;

import java.util.HashMap;
import java.util.Map;

public class Dorfbewohner implements Role {

    @Override
    public String getName() {
        return "Dorfbewohner";
    }

    @Override
    public int getActionCount() {
        return 0;
    }

    @Override
    public void setAffectedPlayer(int playerId) {}

    @Override
    public void runAction(int action) {}
}
