package com.yoyoBankingOfDubai.rudra;

import com.yoyoBankingOfDubai.rudra.accounts.Accounts;
import com.yoyoBankingOfDubai.rudra.accounts.Savings;
import com.yoyoBankingOfDubai.rudra.users.User;

import java.util.function.Predicate;


public class mainrunner {

    public static void main(String[] args) {
        Accounts rudra = new Savings("Rudra",4562);
        Accounts rudra1 = new Savings("Rudra",456);
        Accounts rudra2 = new Savings("Rudra",562);
        System.out.println(rudra.getAccountType());
        System.out.println(rudra.getAccountNumber());
        System.out.println(rudra.getBalance());
//        System.out.println(User.count);
        Accounts.getCounter();

//        User user1 = (x) ->{System.out.println(x.toLowerCase());};
//        Predicate<String> predicate = (x) -> x.isEmpty();
//        Predicate<String> predicate1 = (x) -> x.isBlank();
//        System.out.println(predicate1.or(predicate).negate().test(" "));
//        user1.userID("RTz");
    }

}
