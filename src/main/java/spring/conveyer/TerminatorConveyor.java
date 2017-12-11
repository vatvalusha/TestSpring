package spring.conveyer;

import spring.POJO.robot.Robot;
import spring.interfaces.part.body.robot.RobotConveyor;

/**
 * Created by Valera on 30.11.2017.
 */
public abstract class TerminatorConveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobot();
}
