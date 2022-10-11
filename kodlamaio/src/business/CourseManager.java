package business;

import core.logging.BaseLogger;
import dataAccess.CourseDal;
import entities.Course;

public class CourseManager {

    private CourseDal courseDal;
    private BaseLogger[] loggers;

    public CourseManager(CourseDal courseDal, BaseLogger[] loggers) {
        this.courseDal = courseDal;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        Course[] courses = {

                new Course(1,"java kurs","0 dan ileri seviyeye",3000),
                new Course(2,"oop design","oop geliştirme",1500)
        };

        for (Course course1 : courses){

            if (course.getName().equalsIgnoreCase(course.getName())){
                throw new Exception("Aynı isimde kurs ekleyemezsiniz.");
            }

        }

        if (course.getPrice()<0){
            throw new Exception("kurs fiyatı 0'dan az olamaz");
        }
        courseDal.add(course);

        for (BaseLogger logger : loggers){
            logger.log(course.getName());
        }


    }


}
