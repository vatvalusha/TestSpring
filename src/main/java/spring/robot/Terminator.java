package spring.robot;

import spring.interfaces.part.body.robot.Hand;
import spring.interfaces.part.body.robot.Head;
import spring.interfaces.part.body.robot.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class Terminator extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnable;

    public Terminator(){}

    public Terminator(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    public Terminator(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnabled;
    }
    public Terminator(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnabled;
    }

    @Override
    public void action() {
        getHand().doHand();
        getHead().doHead();
        getLeg().doLeg();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnable);
    }

    @Override
    public void punch() {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + ": Terminator is Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println(this + ": Terminator is init");
    }

    public void initObject(){
        System.out.println("inti");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }
}
