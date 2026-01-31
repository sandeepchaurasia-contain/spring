package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Emp e1 = (Emp) context.getBean("emp");
        Emp e2 = (Emp) context.getBean("emp");

        System.out.println(e1);
        System.out.println(e2);
    }
}
