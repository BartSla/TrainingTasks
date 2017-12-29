package pl.coderstrust.solutionFromUdemy.OOP;

public class Bank{

    private long Number;
    private double balance;
    private String userName;
    private String email;
    private int phoneNumber;

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("You deposited " + deposit + "$ . Your balance is " + this.balance);

    }
    public void withdraw(double withdraw){
        if(withdraw > this.balance){
            System.out.println("Insufficent funds! You got only " + this.balance);
        }else{
            this.balance-=withdraw;
            System.out.println("Your account balacne is " + this.balance);
        }
    }

    public long getNumber() {
        return Number;
    }

    public void setNumber(long number) {
        Number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /* my code before Tim Buchalka

    private long accountNumber;
    private int balance;
    private String userName;
    private String email;
    private int phoneNumber;
    public int withdraw;
    public int deposit;

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setUserName (String userName) {
        String validName = userName.toLowerCase();
        if(validName.equals("bartek"))
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public void setEmail(String email) {
        String validEmail = email.toLowerCase();
        if(validEmail.equals("bartek@wp.pl"))
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int incrementDeposit(int deposit){

        this.balance = balance + deposit;
        this.deposit = deposit;
        return this.balance;
    }

    public int withdrawDeposit(int withdraw) {
        if(withdraw > this.balance){
            System.out.println("Insufficient funds!");
        }else {
            this.balance = balance - withdraw;
            }
            this.withdraw = withdraw;
            return this.balance;

    }
*/











}
