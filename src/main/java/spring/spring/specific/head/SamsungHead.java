package spring.spring.specific.head;

import spring.interfaces.part.body.robot.Head;

/**
 * Created by valeriyartemenko on 07.10.17.
 */
public class SamsungHead implements Head{
    @Override
    public void doHead() {
        System.out.println("Samsung head clever them Dasha");
    }
}
