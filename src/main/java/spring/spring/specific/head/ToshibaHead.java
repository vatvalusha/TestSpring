package spring.spring.specific.head;

import org.springframework.stereotype.Component;
import spring.interfaces.part.body.robot.Head;

/**
 * Created by valeriyartemenko on 07.10.17.
 */

@Component
public class ToshibaHead implements Head {
    @Override
    public void doHead() {
        System.out.println("Toshiba Head is mad");
    }
}
