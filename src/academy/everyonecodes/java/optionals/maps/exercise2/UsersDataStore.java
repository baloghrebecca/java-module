package academy.everyonecodes.java.optionals.maps.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class UserDataStore {
    private Map<String, User> users;

    public UserDataStore() {
        User userOne = new User("Rebecca", "1");
        User userTwo = new User("David", "2");
        users = new HashMap<String, User>();
        users.put(userOne.getUsername(), userOne);
        users.put(userOne.getUsername(), userOne);
    }

    public Optional<User> getUserByUsername(String input) {
        if (users.containsKey(input)) {
            return Optional.of(users.get(input));
        }
        return Optional.empty();
    }
}