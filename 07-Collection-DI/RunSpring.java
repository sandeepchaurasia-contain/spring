package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student s = (Student) context.getBean("student");
        s.show();

        context.close();
    }
}
