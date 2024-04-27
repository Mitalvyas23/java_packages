import java.util.Scanner;

public class Bank_account {
    private int account_number;
    private String account_holder_name;
    private int balance;

    public Bank_account(int account_number,String account_holder_name,int balance){
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.balance = balance;
    }
    public String toString(){
        return "Account number : "+account_number+"\nAccount_holder_name : "+account_holder_name+"\nBalance : "+balance;
    }

    public int getBalance(){
        return balance;
    }
    public void deposite(int balance){
        this.balance += balance;
        System.out.println("Your money is successfully deposited...Your current balance is : "+getBalance());
    }

    public void withdraw(int balance){
        if(balance <= 0){
            System.out.println("Invalid input");
        }
        else if(balance > this.balance){
            System.out.println("Your current balance is low ");
        }else{
            this.balance -= balance;
            System.out.println("Your money is successfully withdraw from your account...Your current balance is : "+getBalance());
        }
    }
}

