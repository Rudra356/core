package com.yoyoBankingOfDubai.rudra;

import com.yoyoBankingOfDubai.rudra.accounts.Accounts;
import com.yoyoBankingOfDubai.rudra.accounts.Savings;
import com.yoyoBankingOfDubai.rudra.users.User;

import java.util.Locale;

public class mainrunner {

    public static void main(String[] args) {
        Accounts rudra = new Savings("Rudra",4562);
        System.out.println(rudra.getAccountType());
        System.out.println(rudra.getAccountNumber());
        System.out.println(rudra.getBalance());
        System.out.println(User.count);

        User user1 = (x) -> System.out.println(x.toLowerCase());
       user1.userID("RTz");
    }

}
