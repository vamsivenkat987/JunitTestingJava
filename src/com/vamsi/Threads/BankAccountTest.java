package com.vamsi.Threads;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;
    @org.junit.jupiter.api.BeforeAll
    void setup(){
        account = new BankAccount(1000.0,"vamsi",BankAccount.CHECKING);
        System.out.println("Testing was running");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount bankAccount = new BankAccount(1000.0,"vamsi",BankAccount.CHECKING);
        double check = bankAccount.deposit(200,true);
        assertEquals(1200.0,check,0);
        BankAccount bankAccount1 = new BankAccount(1000.0,"vamsi",BankAccount.SAVINGS);
        double check1 = bankAccount1.deposit(200.0,false);
        assertEquals(1000,check1,0);
        assertEquals(1000,bankAccount1.getMoney(),0);
    }


    @org.junit.jupiter.api.Test
    void withDrawl() {
        BankAccount bankAccount1 = new BankAccount(1000.0,"vamsi",BankAccount.CHECKING);
        bankAccount1.withDrawl(200.0,true);
        assertEquals(800,bankAccount1.getMoney(),0);
    }

    @org.junit.jupiter.api.Test
    void getMoney_deposit() {
        BankAccount bankAccount1 = new BankAccount(1000.0,"vamsi",BankAccount.CHECKING);
        bankAccount1.deposit(200.0,false);
        assertEquals(1000,bankAccount1.getMoney(),0);
    }
    @org.junit.jupiter.api.Test
    void getMoney_withdrawal() {
        BankAccount bankAccount1 = new BankAccount(1000.0,"vamsi",BankAccount.CHECKING);
        bankAccount1.withDrawl(200.0,true);
        assertEquals(800,bankAccount1.getMoney(),0);
    }
    @org.junit.jupiter.api.Test
    public void isChecking_true(){
        BankAccount bankAccount1 = new BankAccount(1000.0,"vamsi",BankAccount.SAVINGS);
        assertFalse(bankAccount1.isChecking());
//        assertEquals(false,bankAccount1.isChecking());
        BankAccount bankAccount2 = new BankAccount(1000.0,"vamsi",BankAccount.CHECKING);
//        assertEquals(true,bankAccount2.isChecking());
        assertTrue(bankAccount2.isChecking());
    }

}