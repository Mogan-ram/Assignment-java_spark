package com.revature.assign3;

public class Customer {
    private String userName;
    private long phoneNo;
    private int bill;
    private static String greetMsg = "Visit Again";
    final int tax = 20;

    public Customer(){

    }

    public Customer(String userName, long phoneNo, int bill){
        this.userName = userName;
        this.phoneNo = phoneNo;
        this.bill = bill;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public static String getGreetMsg() {
        return greetMsg;
    }

    public static void setGreetMsg(String greetMsg) {
        Customer.greetMsg = greetMsg;
    }

    public int getTax() {
        return tax;
    }

    public String greet(int amt){
        int total =amt+tax;
        return "your bill will be: " + total +" "+ greetMsg;
    }
    public String greet(int amt, String u_name){
        int total =amt+tax;

        return "your bill will be: " + total +" "+"Thank you "+u_name +" " +greetMsg;
    }

}
