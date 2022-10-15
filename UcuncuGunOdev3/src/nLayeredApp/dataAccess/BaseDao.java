package nLayeredApp.dataAccess;

import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;
import nLayeredApp.entities.Teacher;

public interface BaseDao {

	void courseAdd(Course course);
	
	void categoryAdd(Category category);
	
	void teacherAdd(Teacher teacher);
}
