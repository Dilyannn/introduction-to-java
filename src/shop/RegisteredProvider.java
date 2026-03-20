package shop;

public abstract class RegisteredProvider implements Provider {
    private String registrationNumber;

    protected RegisteredProvider(String registrationNumber) {
        setRegistrationNumber(registrationNumber);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "UNREGISTERED";
            return;
        }
        this.registrationNumber = registrationNumber;
    }
}
