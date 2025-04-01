package com.yoyoBankingOfDubai.rudra.accounts;

public class Accounts {
    private static long counter =0;
    private String HolderName;
    private int AccountNumber;
    private double Balance;
    private String AccountType;

    protected Accounts(){
    updateCounter();
    }

    protected Accounts(String HolderName, int AccountNumber, String AccountType){
        this.HolderName = HolderName;
        this.AccountNumber = AccountNumber;
        //this.AccountType = AccountType;
        this.Balance = 0.0;
        updateCounter();
    }
    private void updateCounter(){
        counter++;
    }

    public static void getCounter(){
        System.out.println(counter);
    }
    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }
     public void Credit(double money){
        if(money<0){
            this.Balance = 0;
        }else{
            this.Balance += money;
        }
     }

    public void debit(double money){
        if(money>0 && money<Balance)
            this.Balance -= money;
        else
            System.out.println("Error occurs");

    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        this.AccountType = accountType;
    }
}
