package dataAccess;

import entities.Course;

public class JdbcCourseDal implements CourseDal{
    @Override
    public void add(Course course) {
        System.out.println(course.getName() + " Jdbc ile veritabanına eklendi.");
    }
}
