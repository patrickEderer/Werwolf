package roles;

public interface Role {

    String getName();
    int getActionCount();
    void setAffectedPlayer(int playerId);
    void runAction(int action);
}
