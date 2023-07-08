package org.example.homework.lesson15.task3;
/*
Task 5
Создайте пользовательское исключение с именем InsufficientFundsException.
Это исключение должно создаваться всякий раз, когда пользователь пытается
снять больше денег, чем у него есть на его счету. То есть есть сущности User (BankAccount) ...
Программа должна уметь выводить сумму на счете.
 */
public class BankAccount {
    private String holder;
    private Currency currency;
    private double amount;

    public BankAccount(String holder, Currency currency, double amount) {
        this.holder = holder;
        this.currency = currency;
        this.amount = amount;
    }

    public String getHolder() {
        return holder;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public void putOnMoney(int money) {
        amount += money;
    }

    public void withdrawMoney(int money) throws InsufficientFundsException {
        if (money > amount) {
            throw new InsufficientFundsException("Holder " + holder + " has not enough " + currency);
        }
        amount -= money;
    }

    public void displayAmount() {
        System.out.println(holder + " : " + amount + " " + currency);
    }
}



