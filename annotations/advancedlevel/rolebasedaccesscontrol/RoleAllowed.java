package org.example.Day06.annotations.advancedlevel.rolebasedaccesscontrol;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}
