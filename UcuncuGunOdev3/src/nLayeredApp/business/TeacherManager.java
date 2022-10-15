package nLayeredApp.business;

import nLayeredApp.entities.Teacher;

public class TeacherManager {

	public void add(Teacher teacher) {
		System.out.println(teacher.getTeacherName()+" "+teacher.getTeacherSurname()+" öðretmen olarak eklendi.");
	}
}
