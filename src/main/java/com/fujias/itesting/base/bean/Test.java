package com.fujias.itesting.base.bean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        // TODO Auto-generated method stub
        Class<?> clazz = Class.forName("com.fujias.itesting.base.bean.BaseInfo");
        // 调用TestReflect类中的reflect1方法
        Method method = clazz.getMethod("show");
        method.invoke(clazz.newInstance());
        // Java 反射机制 - 调用某个类的方法1.
        // 调用TestReflect的reflect2方法
        method = clazz.getMethod("show2", int.class, String.class);
        method.invoke(clazz.newInstance(), 20, "张三");
        // Java 反射机制 - 调用某个类的方法2.
        // age -> 20. name -> 张三
    }
}
