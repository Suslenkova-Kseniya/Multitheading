package main.java.by.bsuir.WT.lab3.server.controller;

import main.java.by.bsuir.WT.lab3.beans.Request;
import main.java.by.bsuir.WT.lab3.beans.Response;

public interface ServerController {
	Response action(Request request);
}
