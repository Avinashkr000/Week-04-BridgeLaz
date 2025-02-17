package org.example.Day06.annotations.advancedlevel.rolebasedaccesscontrol;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        User adminUser = new User("ADMIN");
        User regularUser = new User("USER");

        AdminPanel adminPanel = new AdminPanel();
        Method[] methods = adminPanel.getClass().getMethods();

        executeMethod(adminPanel, adminUser, methods[0]);
        executeMethod(adminPanel, regularUser, methods[0]);
        executeMethod(adminPanel, adminUser, methods[1]);
        executeMethod(adminPanel, regularUser, methods[1]);
        executeMethod(adminPanel, adminUser, methods[2]);
    }

    public static void executeMethod(AdminPanel adminPanel, User user, Method method) throws Exception {
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (roleAllowed.value().equals(user.getRole())) {
                method.invoke(adminPanel);
            } else {
                System.out.println("Access Denied!");
            }
        } else {
            method.invoke(adminPanel);
        }
    }
}
