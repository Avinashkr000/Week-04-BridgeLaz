package org.example.Day06.annotations.intermediatelevel.fieldvalidation;

import java.lang.reflect.Field;

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (username.length() > maxLength.value()) {
                throw new IllegalArgumentException("Username exceeds maximum length of " + maxLength.value() + " characters.");
            }

            this.username = username;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}
