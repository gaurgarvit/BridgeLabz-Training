package org.example;

public class DatabaseConnection {
    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("DB Connected");
    }

    public void disconnect() {
        connected = false;
        System.out.println("DB Disconnected");
    }

    public boolean isConnected() { return connected; }
}