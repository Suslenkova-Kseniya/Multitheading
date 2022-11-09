package main.java.by.bsuir.WT.lab3.server.controller;

import main.java.by.bsuir.WT.lab3.server.controller.impl.ServerControllerImpl;

public final class ControllerFactory {
	private static final ControllerFactory instance = new ControllerFactory();
	private final ServerController serverController = new ServerControllerImpl();
	
	private ControllerFactory() {}
	
	public ServerController getServerController() {
		return serverController;
	}
	
	public static ControllerFactory getInstance() {
		return instance;
	}
}
