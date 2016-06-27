package com.ranga.reflection.completeexample;

/**
 * Created by rgonugunta on 6/27/16.
 */
public @interface UnderConstruction {
    String owner() default "Patric Naughton";

    String value() default "Object is Under Construction";

    String createdBy() default "Mike Sheridan";

    String lastChanged() default "2011-07-08";
}
