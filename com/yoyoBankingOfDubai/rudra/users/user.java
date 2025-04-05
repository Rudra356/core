package com.yoyoBankingOfDubai.rudra.users;

import java.time.LocalDate;
import java.util.UUID;

public class user {
    private String userId;
    private String userName;
    private LocalDate dob;
    private String accountType;
    private String accountNumber;
    private String panNo;
    private String password;

    public user() {
    }

    public user(String userId) {
        System.out.println(getUserName() + getUserId() + getPanNo() + getAccountType() + getPanNo() + getAccountNumber());
    }

    public user(String userName, LocalDate dob, String accountType, String panNo, String password) {
        setUserId();
        setUserName(userName);
        setDob(dob);
        setAccountType(accountType);
        setPanNo(panNo);
        setPassword(password);
        setAccountNumber();

        System.out.println("✅ User Created Successfully:");
        System.out.println("----------------------------");
        System.out.println("👤 Name          : " + getUserName());
        System.out.println("🆔 User ID       : " + getUserId());
        System.out.println("📄 PAN Number    : " + getPanNo());
        System.out.println("🎂 Date of Birth : " + getDob());
        System.out.println("🏦 Account Type  : " + getAccountType());
        System.out.println("💳 Account No.   : " + getAccountNumber());
        System.out.println("----------------------------");
    }


    public String getUserId() {
        return userId;
    }

    public String setUserId() {
        if (this.userId == null) {
            this.userId = UUID.randomUUID().toString();
        }
        return this.userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (this.userName == null) {
            this.userName = userName;
        }
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        if (this.dob == null) {
            this.dob = dob;
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (this.accountType == null) {
            this.accountType = accountType;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        // 10-digit random number
        this.accountNumber = String.valueOf((long) (Math.random() * 9_000_000_000L + 1_000_000_000L));
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        if (this.panNo == null) {
            this.panNo = panNo;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (this.password == null) {
            this.password = password;
        }
    }
}
