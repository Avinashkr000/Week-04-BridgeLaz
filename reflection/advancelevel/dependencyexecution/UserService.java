package org.example.Day06.reflection.advancelevel.dependencyexecution;
public class UserService {

    @Inject
    private DatabaseService databaseService;

    public void performService() {
        databaseService.connect();
        System.out.println("Performing user service...");
    }
}
