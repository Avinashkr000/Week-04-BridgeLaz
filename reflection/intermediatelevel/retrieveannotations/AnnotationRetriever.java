package org.example.Day06.reflection.intermediatelevel.retrieveannotations;

import java.lang.annotation.Annotation;

public class AnnotationRetriever {
    public static void main(String[] args) {

        Class<org.example.Day06.reflection.intermediatelevel.retrieveannotations.MyClass> clazz = org.example.Day06.reflection.intermediatelevel.retrieveannotations.MyClass.class;


        if (clazz.isAnnotationPresent(org.example.Day06.reflection.intermediatelevel.retrieveannotations.Author.class)) {

            org.example.Day06.reflection.intermediatelevel.retrieveannotations.Author authorAnnotation = clazz.getAnnotation(org.example.Day06.reflection.intermediatelevel.retrieveannotations.Author.class);


            System.out.println("Author Name: " + authorAnnotation.name());
        } else {
            System.out.println("Author annotation not present.");
        }
    }
}