package org.example.Day06.annotations.intermediatelevel.fieldvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}
