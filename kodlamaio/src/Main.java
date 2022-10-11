import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.BaseLogger;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDal;
import dataAccess.JdbcCourseDal;
import dataAccess.JdbcTeacherDal;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {


        Teacher teacher = new Teacher(1,"abc","def");
        BaseLogger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};

        TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDal(),loggers);
        teacherManager.add(teacher);


        Category category = new Category(5,"Mobil programlama");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDal(),loggers);
        categoryManager.add(category);

        Course course = new Course(4,"frontend eğitimi","Uygulamalı ",2500);
        CourseManager courseManager = new CourseManager(new JdbcCourseDal(),loggers);
        courseManager.add(course);


    }
}