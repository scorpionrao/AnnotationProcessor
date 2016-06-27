package com.ranga.reflection;

/**
 * Created by rgonugunta on 6/26/16.
 */
public class EdibleExample {

    public @interface Edible {
        boolean value() default false;
    }

    @Edible(true)
    Item item = new Carrot();

    public class Item {

    }

    public class Carrot extends Item {

    }
}
