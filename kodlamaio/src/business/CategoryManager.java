package business;

import core.logging.BaseLogger;
import dataAccess.CategoryDal;
import entities.Category;

public class CategoryManager {

    private CategoryDal categoryDal;
    private BaseLogger[] baseLoggers;

    public CategoryManager(CategoryDal categoryDal, BaseLogger[] baseLoggers) {
        this.categoryDal = categoryDal;
        this.baseLoggers = baseLoggers;
    }

    public void add(Category category) throws Exception {

        Category[] categories = {new Category(1,"abc"),
                new Category(2,"cdf")};

        for (Category category1:categories){

            if (category1.getName().equalsIgnoreCase(category1.getName())){

                throw new Exception("Aynı kategoriden bir daha eklenemez");

            }
        }

        categoryDal.add(category);

        for (BaseLogger baseloggers : baseLoggers ){

            baseloggers.log(category.getName());

        }

    }




}
