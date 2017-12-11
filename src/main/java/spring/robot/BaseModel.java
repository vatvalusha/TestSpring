package spring.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import spring.POJO.robot.Robot;
import spring.interfaces.part.body.robot.Hand;
import spring.interfaces.part.body.robot.Head;
import spring.interfaces.part.body.robot.Leg;

/**
 * Created by Valera on 27.11.2017.
 */
public abstract class BaseModel implements Robot {

    @Autowired
    public Hand hand;
    @Autowired
    public Leg leg;
    @Autowired
    public Head head;

    public BaseModel() {
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

//    @Required
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

//    @Required
    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

//    @Required
    public void setHead(Head head) {
        this.head = head;
    }
}
