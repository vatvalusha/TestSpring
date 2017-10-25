package main.spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import main.spring.robot.Terminator;

/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Terminator terminator = (Terminator)context.getBean("terminator");
        terminator.action();
    }
}
