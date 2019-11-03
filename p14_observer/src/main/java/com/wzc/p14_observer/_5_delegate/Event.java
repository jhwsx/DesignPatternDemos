package com.wzc.p14_observer._5_delegate;

import java.lang.reflect.Method;

/**
 * 事件类
 * @author wzc
 * @date 2018/4/19
 */
public class Event {
    private Object mObject;
    private String mMethodName;
    private Object[] mParams;
    private Class[] mParamTypes;

    public Event(Object object, String methodName, Object... args) {
        mObject = object;
        mMethodName = methodName;
        mParams = args;
        contractParamTypes(mParams);

    }

    private void contractParamTypes(Object[] params) {
        mParamTypes = new Class[params.length];

        for (int i = 0; i < mParamTypes.length; i++) {
            mParamTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Class<?> clazz = mObject.getClass();
        Method method = clazz.getMethod(mMethodName, mParamTypes);
        // 非空校验
        if (null == method) {
            return;
        }
        method.invoke(mObject, mParams);
    }
}
