package main.spring.spring.specific.head;

import main.spring.interfaces.part.body.robot.Head;

/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class ToshibaHead implements Head {
    @Override
    public void doHead() {
        System.out.println("Toshiba Head is mad");
    }
}
