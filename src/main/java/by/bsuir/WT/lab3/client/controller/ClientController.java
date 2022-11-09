package main.java.by.bsuir.WT.lab3.client.controller;


import main.java.by.bsuir.WT.lab3.beans.*;

public interface ClientController {
	Request createRequest();
	void processResponse(Response response);
}
