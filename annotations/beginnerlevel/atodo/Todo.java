package org.example.Day06.annotations.beginnerlevel.atodo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();

    String assignedTo();

    String priority() default "MEDIUM";
}
