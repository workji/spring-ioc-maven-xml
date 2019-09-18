package com.ki.example6;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MsgReplacer1 implements MethodReplacer {
    @Override
    public Object reimplement(Object arg0, Method method, Object[] objects) throws Throwable {

        if (isFormatMsgMethod(method)) {
            String msg = (String) objects[0];
            return "<good>" + msg + "</good>";
        } else {
            throw new IllegalArgumentException("Unable to Replace Method : " + method.getName());
        }
    }

    private boolean isFormatMsgMethod(Method method) {
        if (method.getParameterTypes().length != 1) {
            return false;
        }

        if (!("formatMsg".equals(method.getName()))) {
            return false;
        }

        if (method.getReturnType() != String.class) {
            return false;
        }

        if (method.getParameterTypes()[0] != String.class) {
            return false;
        }
        return true;
    }
}
