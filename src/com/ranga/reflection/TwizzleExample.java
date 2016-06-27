package com.ranga.reflection;

/**
 * Created by rgonugunta on 6/26/16.
 */
public class TwizzleExample {

    public @interface Twizzle {
    }

    @TwizzleExample.Twizzle
    public void toggle() {
    }
}
