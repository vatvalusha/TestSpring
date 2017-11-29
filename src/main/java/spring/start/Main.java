package spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.robot.Terminator;

import java.io.File;


/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Terminator terminator = (Terminator)context.getBean("terminator");
        Terminator t1000 = (Terminator)context.getBean("t1000");
        System.out.println(t1000 + "    " +  t1000.getHand() +" " +t1000.getColor());
        terminator.action();
//        File f = new File("context.xml");
//        System.out.println("Exist test: " + f.exists());
    }
}
