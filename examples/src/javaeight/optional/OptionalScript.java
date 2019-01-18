package javaeight.optional;

import java.util.Optional;

public class OptionalScript {
  public static void main(String[] args) {
    meth1();
    meth2();
  }

  static void meth1() {
    String name = "";
    User user = getUser(name); // might return null
    Location location = null;
    if (user != null) {
      location = getLocation(user);
    }
  }

  static void meth2() {
    String name = "";
    Optional<User> user = Optional.ofNullable(getUser(name));
    Optional<Location> location = user.map(u -> getLocationOptional(user));
  }

  static User getUser(String name) {
    return null;
  }

  static Location getLocation(User u) {
    return null;
  }

  static Location getLocationOptional(Optional<User> u) {
    return null;
  }
}

class User {
}

class Location {
}
