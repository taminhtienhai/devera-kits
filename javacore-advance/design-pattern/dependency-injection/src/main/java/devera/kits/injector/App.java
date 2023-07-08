package devera.kits.injector;

import devera.kits.injector.model.Course;
import devera.kits.injector.model.School;
import devera.kits.injector.model.Student;

public class App {
    public static void main(String[] args) {

        var injector = new Injector();

        // Load all dependencies
        injector.load(Student.class, Course.class);
        var school = injector.inject(School.class);

        System.out.println(school.student.name);
    }
}
