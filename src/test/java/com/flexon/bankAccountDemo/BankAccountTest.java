package com.flexon.bankAccountDemo;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
    @Test
    public void add() {
        System.out.println("add");
        double deposit = 100;
        double expResult = 100;
        BankAccount bankAccount = new BankAccount();
        double result = bankAccount.add(deposit);
        Assert.assertEquals(expResult,result,0.0001);
    }



    @Test
    public void deductTest1() {
        System.out.println("deduct");
        double withdraw = 100;
        double balance = 200;
        double expResult = balance-withdraw;
        BankAccount bankAccount = new BankAccount();
        double result = bankAccount.deduct(withdraw,200);
        Assert.assertEquals("Should be equal",expResult,result,0.0001);
    }
    @Test
    public void deductTest2() {
        System.out.println("deduct");
        double withdraw = 100;
        double balance = 50;
        double expResult = balance - withdraw;
        BankAccount bankAccount = new BankAccount();
        double result = bankAccount.deduct(withdraw,50);
        Assert.assertNotEquals("Should not be equal",expResult,result);
    }

}