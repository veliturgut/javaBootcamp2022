package business;

import core.logging.BaseLogger;
import dataAccess.TeacherDal;
import entities.Teacher;

public class TeacherManager {

    private TeacherDal teacherDal;
    private BaseLogger[] loggers;

    public TeacherManager(TeacherDal teacherDal, BaseLogger[] logger) {
        this.teacherDal = teacherDal;
        this.loggers = logger;
    }

    public void add(Teacher teacher){
        teacherDal.add(teacher);



        for (BaseLogger logger : loggers){
            logger.log(teacher.getFirstName() + "" + teacher.getLastName());

        }

    }


}
