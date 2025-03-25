package com.yoyoBankingOfDubai.rudra;

public class Savings extends Accounts {
    public Savings() {
        super.setAccountType("Savings");
        super.Credit(100000);
    }
    public  Savings(String HolderName, int AccountNumber) {
        super.setAccountType("Savings");
        super.setHolderName(HolderName);
        super.setAccountNumber(AccountNumber);
        super.Credit(100000);
    }
}
