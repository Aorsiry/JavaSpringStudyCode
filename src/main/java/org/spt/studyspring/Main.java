package org.spt.studyspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.spt.studyspring.entity.Student;
import org.spt.studyspring.service.Service;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student) context.getBean("student");
        //Service service = (Service) context.getBean(Service.class);
        student.hello();
    }
}
