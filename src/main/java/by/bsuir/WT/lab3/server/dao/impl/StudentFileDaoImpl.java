package main.java.by.bsuir.WT.lab3.server.dao.impl;

import jakarta.xml.bind.*;
import main.java.by.bsuir.WT.lab3.beans.*;
import main.java.by.bsuir.WT.lab3.server.dao.StudentFileDao;

import java.io.FileReader;
import java.util.List;

public class StudentFileDaoImpl implements StudentFileDao {
	private List<StudentFile> students;
	
	@Override
	public List<StudentFile> getAll(){
		if(students == null) {
			try {
				JAXBContext context = JAXBContext.newInstance(Students.class);
				Students unmarshalledEntity = ((Students) context.createUnmarshaller().
						unmarshal(new FileReader("./src/main/resources/students_db.xml")));
 				students = unmarshalledEntity.getStudents();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return students;
	}
	
	@Override
	public StudentFile get(int StudentId) {
		for(StudentFile student : students) {
			if(student.getId() == StudentId) {
				return student;
			}
		}
		return null;
	}
	
	@Override
	public boolean add(StudentFile student) {
		return students.add(student);
	}
	
	@Override
	public boolean edit(StudentFile changedStudent) {
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getId() == changedStudent.getId()) {
				students.set(i, changedStudent);
				return true;
			}
		}
		return false;
	}
}
