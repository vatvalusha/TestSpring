package spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.POJO.robot.Robot;
import spring.interfaces.part.body.robot.RobotConveyor;
import spring.pool.TerminatorPool;
import spring.robot.Terminator;

import java.io.File;


/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Terminator terminator = (Terminator) context.getBean("model1");
        Terminator terminator1 = (Terminator) context.getBean("model2");


        terminator.action();
        terminator1.action();
//        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

//        RobotConveyor terConveyor = (RobotConveyor)context.getBean("terConveyor");

//        System.out.println(robotReplaceMethod.getNotReplacer());

//        Terminator terminator = (Terminator)context.getBean("terminator");
//        Terminator t1000 = (Terminator)context.getBean("t1000");
//        System.out.println(t1000 + "    " +  t1000.getHand() +" " +t1000.getColor());
//        terminator.action();

//        Robot ter1 = terConveyor.createRobot();
//        Robot ter2 = terConveyor.createRobot();
//        Robot ter3 = terConveyor.createRobot();
//
//        System.out.println("ter1: " + ter1);
//        System.out.println("ter2: " + ter2);
//        System.out.println("ter3: " + ter3);

//        File f = new File("context.xml");
//        System.out.println("Exist test: " + f.exists());;
    }
}
