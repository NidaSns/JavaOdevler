package nLayeredApp.business;

import java.util.ArrayList;

import nLayeredApp.dataAccess.BaseDao;
import nLayeredApp.entities.Category;

public class CategoryManager {
	
	private BaseDao baseDao;
	private ArrayList<String> CategoryList = new ArrayList<String>();
	
	
	public CategoryManager(BaseDao baseDao) {
		this.baseDao=baseDao;
	}
	
	public void add(Category category) throws Exception {
		
		for (String categoryList : CategoryList) {
			if(category.getCategoryName()==categoryList) {
				throw new Exception("Ayný isimde bir kategori zaten mevcut.");
			}
		}
		baseDao.categoryAdd(category);
		CategoryList.add(category.getCategoryName());
		System.out.println(category.getCategoryName() + " kategori olarak eklendi");
	}
}
