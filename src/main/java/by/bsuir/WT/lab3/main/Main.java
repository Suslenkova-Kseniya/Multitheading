package main.java.by.bsuir.WT.lab3.main;

import main.java.by.bsuir.WT.lab3.client.main.Client;
import main.java.by.bsuir.WT.lab3.server.main.Server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client();

        server.run();
        client.run();
    }
}
