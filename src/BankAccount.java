
public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;

    // Constructor is private to force use of the builder
    private BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    // Static nested Builder class
    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

// Test in main method

    public static void main(String[] args) {
        BankAccount account = new BankAccount.BankAccountBuilder("Kishor", "123456789")
                .setEmail("1109jahan@gmail.com")
                .build();

        System.out.println("Name: " + account.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Email: " + account.getEmail());
    }
}
