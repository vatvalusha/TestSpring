package spring.replacer;

import org.springframework.beans.factory.support.MethodReplacer;


import java.lang.reflect.Method;

/**
 * Created by Valera on 30.11.2017.
 */
public class TerminatorReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "replaced method";
    }
}