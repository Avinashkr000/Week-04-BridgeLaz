package org.example.Day06.annotations.beginnerlevel.markimportantmethods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}
