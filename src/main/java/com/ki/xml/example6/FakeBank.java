package com.ki.xml.example6;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class FakeBank implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        if (isReplaceMethod(method)) {
            String arg0 = (String)args[0];
            int allAmount = ((Bank)obj).getBankAllAmount(arg0);
            return allAmount;
        }

        return null;
    }

    private boolean isReplaceMethod(Method method) {
        if (method.getParameterTypes().length != 1) {
            return false;
        }

        if (!("getBankBalance".equals(method.getName()))) {
            return false;
        }

        if (method.getReturnType() != int.class) {
            return false;
        }

        if (method.getParameterTypes()[0] != String.class) {
            return false;
        }
        return true;
    }
}
