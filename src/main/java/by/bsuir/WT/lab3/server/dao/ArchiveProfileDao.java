package main.java.by.bsuir.WT.lab3.server.dao;

import main.java.by.bsuir.WT.lab3.beans.*;

import java.util.List;

public interface ArchiveProfileDao {
	List<ArchiveProfile> getAll();
	String login(String username, String password);
	AccountType getAccType(String authToken);
	void logout(String authToken);
}
