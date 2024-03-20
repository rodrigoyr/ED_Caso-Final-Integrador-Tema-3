package usermanagement;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationManager {
    private List<User> users;

    public AuthenticationManager() {
        this.users = new ArrayList<>();
    }

    public void registerUser(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
    }

    public boolean authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
