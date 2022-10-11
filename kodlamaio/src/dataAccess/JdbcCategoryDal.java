package dataAccess;

import entities.Category;

public class JdbcCategoryDal implements CategoryDal{
    @Override
    public void add(Category category) {
        System.out.println(category.getName() + " Jdbc ile veritabanına eklendi.");
    }
}
