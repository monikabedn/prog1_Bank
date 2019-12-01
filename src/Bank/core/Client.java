package Bank.core;

public class Client {
    private String name, surname;

    private String customerNumber;

    public Client (String name, String surname, String customerNumber) {
        this.name = name;
        this.surname = surname;
        this.customerNumber = customerNumber;
            }

    public String getName () {
        return name;
            }

    public String getSurname() {
        return surname;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }
    private String pesel;

    public String getPesel () {
        return pesel;
    }
}
