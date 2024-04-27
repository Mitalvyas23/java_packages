package display.employee_details;

public class employee_account {
    public static void main(String[] args) {
        employee account = new employee("Mital",17,45000);
        System.out.println(account);
        account.setSalary(50000);
        System.out.println(account);
    }
}
