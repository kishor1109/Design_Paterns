public class BankAccount {

    // Private instance variables — only accessible within this class
    private String name;
    private String accountNumber;
    private String email;

    // Private constructor — prevents direct object creation using 'new BankAccount()'
    // Forces users to use the Builder to create objects.
    private BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
    }

    // Getter methods — provide read-only access to the private fields
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    // Static nested Builder class used to build BankAccount objects step-by-step
    public static class BankAccountBuilder {
        // Builder class has the same fields as the outer class
        private String name;
        private String accountNumber;
        private String email;

        // Constructor for Builder — requires 'name' and 'accountNumber' (mandatory fields)
        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        // Optional field setter — allows setting email if desired
        // Returns the Builder itself to allow method chaining
        public BankAccountBuilder setEmail(String email) {
            this.email = email;
            return this;  // Enables chaining like: new Builder(...).setEmail(...).build()
        }

        // The build() method actually creates a BankAccount object
        // and passes the Builder itself to the private constructor
        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    // Test the Builder pattern in the main method
    public static void main(String[] args) {

        // Create a BankAccount object using the Builder
        // Step 1: Provide required fields (name and accountNumber)
        // Step 2: Optionally set email
        // Step 3: Call build() to create the final immutable object
        BankAccount account = new BankAccount.BankAccountBuilder("Kishor", "123456789")
                .setEmail("1109jahan@gmail.com")
                .build();

        // Display account information
        System.out.println("Name: " + account.getName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Email: " + account.getEmail());
    }
}
