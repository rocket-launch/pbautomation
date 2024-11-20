package pages;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.UUID;

public class UsernameSSNGenerator {
    private static String generateUsername() {
        UUID username = UUID.randomUUID();
        Timestamp time = new Timestamp(System.currentTimeMillis());
        return username.toString().replaceAll("-", "").substring(0, 8);
    }

    private static String generateSSN() {
        UUID ssn = UUID.randomUUID();
        return new BigInteger(ssn.toString().replaceAll("-", ""), 16).toString().substring(0, 9);
    }

    public static RegistrationData generateNewTestUser() {
        return new RegistrationData(
                "Fabian",
                "Ferreira",
                "Mapple Park 1023",
                "Detroit",
                "Michigan",
                "34213",
                "123-3844-1234",
                "0" + generateSSN(),
                "fabian_" + generateUsername(),
                "SU391!sT0",
                "SU391!sT0");
    }
}
