package nLayeredApp.business;
import java.util.ArrayList;
import java.util.Iterator;

import nLayeredApp.core.logging.Logger;
import nLayeredApp.dataAccess.BaseDao;
import nLayeredApp.entities.Category;
import nLayeredApp.entities.Course;

public class CourseManager {

	private BaseDao baseDao;
	private ArrayList<String> CourseList = new ArrayList<String>();
	
	private Logger[] loggers;
	
	// bu ?ekilde de liste olu?tabiliriz
	//private List<Logger> loggers;
	
	public CourseManager(BaseDao baseDao,Logger[] loggers){
		this.baseDao=baseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyat? 0'dan k???k olamaz");
		}
		/*
		 * else if(course.getCourseName()==course) {
		 * 
		 * }
		 */
		for (String courseList : CourseList) {
			if(course.getCourseName()==courseList) {
				throw new Exception("Ayn? isimde bir kurs zaten mevcut.");
			}
		}
		
		
		baseDao.courseAdd(course);
	
		CourseList.add(course.getCourseName());
		
		
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
