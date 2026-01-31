package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Emp emp = (Emp) context.getBean("emp");
        emp.show();

        context.close();
    }
}
