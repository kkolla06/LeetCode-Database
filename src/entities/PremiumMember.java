package entities;

public class PremiumMember {
    private String username;
    private String creditCardNumber;

    public PremiumMember(String username, String creditCardNumber) {
        this.username = username;
        this.creditCardNumber = creditCardNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
