package pages;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.UUID;

public class UsernameSSNGenerator {
    public static String generateUsername() {
        UUID username = UUID.randomUUID();
        Timestamp time = new Timestamp(System.currentTimeMillis());
        return username.toString().replaceAll("-", "").substring(0, 8);
    }

    public static String generateSSN() {
        UUID ssn = UUID.randomUUID();
        return new BigInteger(ssn.toString().replaceAll("-", ""), 16).toString().substring(0, 9);
    }
}
