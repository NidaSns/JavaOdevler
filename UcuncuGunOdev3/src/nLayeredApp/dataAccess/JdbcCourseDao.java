package nLayeredApp.dataAccess;

import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Teacher;

public class JdbcCourseDao implements BaseDao{
	

	@Override
	public void categoryAdd(Category category) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile kategori veritaban�na eklendi");

	}

	@Override
	public void teacherAdd(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile ��retmen veritaban�na eklendi");

	}

	@Override
	public void courseAdd(Course course) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile kurs veritaban�na eklendi");

	}
}