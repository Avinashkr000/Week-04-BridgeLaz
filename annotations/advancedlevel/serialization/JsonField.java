package org.example.Day06.annotations.advancedlevel.serialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}
