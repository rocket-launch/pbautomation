package pages;

import java.util.UUID;

public class UsernameGenerator {
    public static String generateUsername() {
        UUID username = UUID.randomUUID();
        return username.toString().replaceAll("-", "").substring(0, 8);
    }
}
