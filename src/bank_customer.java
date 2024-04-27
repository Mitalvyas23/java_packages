import java.util.Scanner;

public class bank_customer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your information to create a bank account....");
        System.out.print("Enter your name : ");
        String name = input.next();
        System.out.print("Enter balance to deposit in bank : ");
        int balance = input.nextInt();
        int number = 12030;
        Bank_account account = new Bank_account(number,name,balance);
        System.out.println("Welcome to bank account....");
        //System.out.println("1 : Create Bank account");
        System.out.println("1 : Bank_details");
        System.out.println("2 : deposit");
        System.out.println("3 : withdraw");
        System.out.println("4 : Exit");
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter your account number to check bank details : ");
                int account_number = input.nextInt();
                if(account_number == number){
                    System.out.println(account);
                }else{
                    System.out.println("The account number is required to check bank details...");
                }
                break;
            case 2:
                System.out.print("enter money : ");
                int deposit = input.nextInt();
                account.deposite(deposit);
                break;
            case 3:
                System.out.print("Enter money : ");
                int withdraw = input.nextInt();
                account.withdraw(withdraw);
                break;
            case 4:
                break;
            default:
                System.out.println("Please enter valid number...");
        }
    }
}
