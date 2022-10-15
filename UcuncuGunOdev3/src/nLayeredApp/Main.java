package nLayeredApp;

import nLayeredApp.business.CategoryManager;
import nLayeredApp.business.CourseManager;
import nLayeredApp.core.logging.DatabaseLogger;
import nLayeredApp.core.logging.FileLogger;
import nLayeredApp.core.logging.Logger;
import nLayeredApp.dataAccess.HibernateCourseDao;
import nLayeredApp.dataAccess.JdbcCourseDao;
import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Teacher;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Course course1 = new Course();
		course1.setCourseName("Java Kursu");
		course1.setId(1);
		course1.setPrice(10);
		course1.setTeacherId(1);
		
		Teacher teacher1 = new Teacher();
		teacher1.setId(1);
		teacher1.setTeacherName("Engin");
		teacher1.setTeacherSurname("Demiroð");
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Yazýlým");
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course1);
		//courseManager.add(course1);

		CategoryManager categoryManager = new CategoryManager(new JdbcCourseDao());
		categoryManager.add(category1);
		//categoryManager.add(category1);
	}

}
