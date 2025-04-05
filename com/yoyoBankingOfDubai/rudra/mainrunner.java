package com.yoyoBankingOfDubai.rudra;

import com.yoyoBankingOfDubai.rudra.accounts.Accounts;
import com.yoyoBankingOfDubai.rudra.accounts.Savings;
import com.yoyoBankingOfDubai.rudra.users.user;

import java.time.LocalDate;


public class mainrunner {

    public static void main(String[] args) {

        user rudra = new user(
                "Rudra",
                LocalDate.of(2005, 8, 7),
                "Savings",
                "DFGHJ1234K",
                "myPassword123");


    }

}
