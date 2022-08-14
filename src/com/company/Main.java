package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
BankAccount bankAccount = new BankAccount();
try {
    bankAccount.deposit(20000);
}catch (LimitException e){
    e.printStackTrace();
}
        Scanner scanner = new Scanner(System.in);
while (true ){
    try {
        System.out.println(" Сумма вывода: ");
        bankAccount.withDraw(scanner.nextInt());
    }catch (LimitException l ){
        System.out.println(l.getMessage());
        try {
            bankAccount.withDraw((int)l.getRemeiningAmount());
        }catch (LimitException e){
            e.printStackTrace();
        }
        break; 
    }
}
    }
}
