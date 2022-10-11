package dataAccess;

import entities.Teacher;

public class JdbcTeacherDal implements TeacherDal{
    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getFirstName()+" " + teacher.getLastName() + " Jdbc ile veritabanına eklendi.");
    }
}
