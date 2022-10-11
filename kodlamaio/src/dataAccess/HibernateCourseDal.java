package dataAccess;

import entities.Course;

public class HibernateCourseDal implements CourseDal{
    @Override
    public void add(Course course) {
        System.out.println(course.getName() + " Hibernate ile veritabanına eklendi.");
    }
}
