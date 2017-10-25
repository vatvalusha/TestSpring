package main.spring.robot;

import main.spring.POJO.robot.Robot;
import main.spring.interfaces.part.body.robot.Hand;
import main.spring.interfaces.part.body.robot.Head;
import main.spring.interfaces.part.body.robot.Leg;

/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class Terminator implements Robot {
    public Hand hand;
    public Leg leg;
    public Head head;

    public Terminator(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void action() {
        hand.doHand();
        leg.doLeg();
        head.doHead();
    }

    @Override
    public void punch() {

    }
}
