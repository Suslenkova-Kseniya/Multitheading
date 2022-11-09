package main.java.by.bsuir.WT.lab3.client.main;

import main.java.by.bsuir.WT.lab3.beans.Response;
import main.java.by.bsuir.WT.lab3.client.controller.*;
import main.java.by.bsuir.WT.lab3.client.controller.impl.ClientControllerImpl;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client extends Thread{
	private Socket sock;
	private ObjectOutputStream outputStream;
	private ObjectInputStream inputStream;
	private int port;
	private ClientController clientController;
	
	@Override
	public void run() {
		try {
			this.setPort(6666);
			sock = new Socket("localhost", port);
			outputStream = new ObjectOutputStream(sock.getOutputStream());
			inputStream = new ObjectInputStream(sock.getInputStream());
			clientController = new ClientControllerImpl();
			while(true) {
				outputStream.writeObject(clientController.createRequest());
				clientController.processResponse((Response)inputStream.readObject());
			}
		} catch (Exception e) {
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
