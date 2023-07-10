package org.example.homework.lesson15.task3;

//+
public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount bankAccount = new BankAccount("Vasiliy", Currency.EUR, 3400);
        bankAccount.displayAmount();
        bankAccount.withdrawMoney(2500);
        bankAccount.displayAmount();
        bankAccount.putOnMoney(200);
        bankAccount.withdrawMoney(1500);
        bankAccount.displayAmount();
    }
}
