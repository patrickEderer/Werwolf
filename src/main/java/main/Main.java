package main;

import classes.Player;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Player> players;

    public static Scanner scanner = new Scanner(System.in);
    static int port;

    public static void main(String[] args) {
        System.out.print("Enter port: ");
        port = scanner.nextInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (serverSocket.isBound()) {
                players.add(new Player(players.size(), serverSocket.accept()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}