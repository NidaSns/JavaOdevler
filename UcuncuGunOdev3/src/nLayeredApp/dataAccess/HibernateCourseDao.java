package nLayeredApp.dataAccess;

import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Teacher;

public class HibernateCourseDao implements BaseDao {

	@Override
	public void courseAdd(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile kurs veritabanına eklendi");
	}

	@Override
	public void categoryAdd(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile kategori veritabanına eklendi");
	}

	@Override
	public void teacherAdd(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile öğretmen veritabanına eklendi");
	}
}
