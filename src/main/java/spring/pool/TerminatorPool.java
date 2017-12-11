package spring.pool;

import spring.POJO.robot.Robot;
import spring.interfaces.part.body.robot.RobotPool;

import java.util.Collection;

/**
 * Created by Valera on 01.12.2017.
 */
public class TerminatorPool implements RobotPool {

    private Collection<Robot> robotCollection;

    public void setRobotCollection(Collection<Robot> robotCollection){
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return null;
    }

    public void action(){
        for(Robot robot : robotCollection){
            robot.action();
            System.out.println();
        }
    }
}
