package pages;

public record RegistrationData(String firstName,
                               String lastName,
                               String address,
                               String city,
                               String state,
                               String zipCode,
                               String phoneNumber,
                               String socialSecurityNumber,
                               String username,
                               String password,
                               String passwordConfirmation) {
}


