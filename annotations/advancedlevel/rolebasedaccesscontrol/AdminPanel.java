package org.example.Day06.annotations.advancedlevel.rolebasedaccesscontrol;

class AdminPanel {
    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted.");
    }

    @RoleAllowed("ADMIN")
    public void createAdmin() {
        System.out.println("Admin created.");
    }

    public void regularMethod() {
        System.out.println("Regular method executed.");
    }
}
