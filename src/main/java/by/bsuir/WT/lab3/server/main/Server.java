package main.java.by.bsuir.WT.lab3.server.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	private int port;
	
	@Override
	public void run() {
		startServer();
	}
	
	public void startServer() {
		this.setPort(6666);
		try (ServerSocket serverSock = new ServerSocket(port)){
			while(true) {
				Socket socket = serverSock.accept();
				ServerThread thread = new ServerThread(socket);
				thread.start();
			}
		} catch (IOException e) {
				System.out.println(e.getMessage());
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
