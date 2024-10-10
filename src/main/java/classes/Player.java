package classes;

import roles.Role;

import java.io.InputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Player {
    public boolean willDie = false;
    public boolean isDead = false;
    public int id;
    public Role role;
    public Socket socket;

    public Player(int id, Socket socket) {
        this.id = id;
        this.socket = socket;

        new Thread(() -> {
            try {
                InputStream inputStream = socket.getInputStream();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
