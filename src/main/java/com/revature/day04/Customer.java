package com.revature.day04;

public class Customer {
    private String userName;
    private String mailId;
    private int balance;
    private long phone;

    Customer(){

    }

    public Customer(String userName, String mailId, int balance, long phone) {
        this.userName = userName;
        this.mailId = mailId;
        this.balance = balance;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int deposit(int amt) throws InvalidDeposit{
        if(amt<=0){
            throw new InvalidDeposit("Bro i can't deposit 0 or negative money to your account😑😑");
        }
        return balance+amt;
    }

    public int withDrawl(int amt) throws InvalidAmount{
        if(amt>balance){
            throw new InvalidAmount("Your account does not  have that much money");
        }
        return balance-amt;
    }
}
