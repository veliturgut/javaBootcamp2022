package dataAccess;

import entities.Category;

public class HibernateCategoryDal implements CategoryDal{
    @Override
    public void add(Category category) {
        System.out.println(category.getName() + " Hibernate ile veritabanına eklendi.");
    }
}
