package com.yoyoBankingOfDubai.rudra;

public class mainrunner {

    public static void main(String[] args) {
        Accounts rudra = new Savings("Rudra",4562);
        System.out.println(rudra.getAccountType());
        System.out.println(rudra.getAccountNumber());
        System.out.println(rudra.getBalance());
    }

}
