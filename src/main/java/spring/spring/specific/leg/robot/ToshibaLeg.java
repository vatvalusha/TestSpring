package spring.spring.specific.leg.robot;

import spring.interfaces.part.body.robot.Leg;

/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class ToshibaLeg implements Leg {
    @Override
    public void doLeg() {
        System.out.println("Toshiba  leg best of the best");
    }
}
