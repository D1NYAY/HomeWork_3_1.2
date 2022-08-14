package com.company;

public class BankAccount {
    public double getAmount() {
        return amount;
    }

    private double amount;
    public void deposit(double sum)throws LimitException{
        amount += sum;
        System.out.println("Вы пополнили счет на: " +  (int) getAmount() + " сом ");
    }
    public void withDraw(int sum) throws LimitException{
        if (sum > amount){
            System.out.println("Операция не доступна, не достаточно средств на счёте " + amount);

        }else {
            amount -= sum;
            System.out.println("Вы сняли: " + sum + " сом " + "остаток на счету: " + amount);
        }

    }
}
