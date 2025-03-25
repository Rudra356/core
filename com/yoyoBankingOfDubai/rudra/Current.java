package com.yoyoBankingOfDubai.rudra;

public class Current extends Accounts {
    public Current() {
        super.setAccountType("Current");
        super.Credit(100000);
    }
    public Current(String HolderName, int AccountNumber) {
        super.setAccountType("Current");
        super.setHolderName(HolderName);
        super.setAccountNumber(AccountNumber);
        super.Credit(100000);
    }
}
