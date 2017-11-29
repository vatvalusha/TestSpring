package spring.spring.specific.hand.robot;

import spring.interfaces.part.body.robot.Hand;

/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class ToshibaHand implements Hand{
    @Override
    public void doHand() {
        System.out.println("Toshiba hand do something");
    }
}
