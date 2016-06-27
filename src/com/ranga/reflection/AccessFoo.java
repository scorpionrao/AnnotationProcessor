package com.ranga.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by rgonugunta on 6/26/16.
 */
public class AccessFoo {

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.hello("Ranga");

        // With Reflection
        try {
            Object foo1 = Class.forName("com.ranga.reflection.Foo").newInstance();
            try {
                Class[] cArgs = new Class[1];
                cArgs[0] = String.class;
                Method m = foo1.getClass().getDeclaredMethod("hello", cArgs);
                try {
                    m.invoke(foo1, "Ranga");
                    System.out.println("Successfully Invoked");
                } catch (InvocationTargetException e) {
                    System.out.println("InvocationTargetException");
                }
            } catch (NoSuchMethodException e) {
                System.out.println("NoSuchMethodException");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (InstantiationException e) {
            System.out.println("InstantiationException");
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        }
    }
}
