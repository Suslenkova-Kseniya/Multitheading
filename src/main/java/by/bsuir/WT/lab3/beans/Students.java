package main.java.by.bsuir.WT.lab3.beans;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name="students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {
	@XmlElements({
		@XmlElement(name="student",type = StudentFile.class),
		})
	private List<StudentFile> students;


	public List<StudentFile> getStudents() {
		return students;
	}
	public void setStudents(List<StudentFile> students) {
		this.students = students;
	}
}
