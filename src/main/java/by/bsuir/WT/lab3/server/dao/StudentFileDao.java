package main.java.by.bsuir.WT.lab3.server.dao;

import main.java.by.bsuir.WT.lab3.beans.StudentFile;

import java.util.List;

public interface StudentFileDao {
	
	List<StudentFile> getAll();
	StudentFile get(int StudentId);
	boolean add(StudentFile student);
	boolean edit(StudentFile changedStudent);
}
