package com.ranga.reflection.ProcessingAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * Created by rgonugunta on 6/27/16.
 */
public class ProcessCustomAnnotation {

    public static void main(String[] args) {
        Class<UseCustomAnnotation> classObject = UseCustomAnnotation.class;
        readAnnotation(classObject);
    }

    static void readAnnotation(AnnotatedElement element) {
        try {
            System.out.println("Annotation element values: \n");
            if (element.isAnnotationPresent(TypeHeader.class)) {
                Annotation singleAnnotation = element.getAnnotation(TypeHeader.class);
                TypeHeader header = (TypeHeader) singleAnnotation;
                System.out.println("Developer: " + header.developer());
                System.out.println("Last Modified: " + header.lastModified());
                System.out.println("Team members: ");
                for (String member : header.teamMembers()) {
                    System.out.print(member + ", ");
                }
                System.out.println("\n");
                System.out.println("Meaning of Life: " + header.meaningOfLife());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
