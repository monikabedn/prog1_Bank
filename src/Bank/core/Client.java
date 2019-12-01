package Bank.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name, surname;
    private String customerNumber;
    private List<Account> accountList;
    private String pesel;


    public Client (String name, String surname, String customerNumber) {
        this.name = name;
        this.surname = surname;
        this.customerNumber = customerNumber;
        accountList = new ArrayList<>();
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


    public String getPesel () {
        return pesel;
    }

    public boolean addAccount (AccountType accountType, String accountNumber) {
        return accountList.add(new Account(accountNumber, accountType));
    }
    public boolean deleteAccount (String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) //equals(accountNumber) zamiast == przy Stringach
                if (account.getBalance().equals(BigDecimal.ZERO))
                    return accountList.remove(account);
        }
        return false;
    }
    public boolean deposit(String accountNumber, BigDecimal amount) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber))
                return account.deposit(amount);
        }
                return false;
        }
        public boolean withdraw(String accountNumber, BigDecimal amount) {
            for (Account account : accountList) {
                if (account.getAccountNumber().equals(accountNumber))

                    return account.withdraw(amount);
            }
            return false;

    }



}
