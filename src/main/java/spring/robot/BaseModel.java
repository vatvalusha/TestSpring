package spring.robot;

import spring.POJO.robot.Robot;
import spring.interfaces.part.body.robot.Hand;
import spring.interfaces.part.body.robot.Head;
import spring.interfaces.part.body.robot.Leg;

/**
 * Created by Valera on 27.11.2017.
 */
public abstract class BaseModel implements Robot {
    public Hand hand;
    public Leg leg;
    public Head head;

    public BaseModel(){

//        System.out.println(this + ": BaseModel Constructor()");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
//        System.out.println(this + ": Terminator init by constructor");
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
