package nLayeredApp.dataAccess;

import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Teacher;

public class JdbcCourseDao implements BaseDao{
	

	@Override
	public void categoryAdd(Category category) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile kategori veritabanına eklendi");

	}

	@Override
	public void teacherAdd(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile öğretmen veritabanına eklendi");

	}

	@Override
	public void courseAdd(Course course) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile kurs veritabanına eklendi");

	}
}
