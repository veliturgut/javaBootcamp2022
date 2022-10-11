package dataAccess;

import entities.Teacher;

public class HibernateTeacherDal implements TeacherDal{
    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getFirstName()+" " + teacher.getLastName() + " Hibernate ile veritabanına eklendi.");
    }
}
