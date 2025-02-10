public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1340449", 10000.0);

        //test activate and suspend
        System.out.println();
        myAccount.activate();
        myAccount.suspend();

        //test deposit and withdraw while suspended
        System.out.println();
        myAccount.suspend();
        myAccount.deposit(10000.0);
        myAccount.withdraw(5000.0);

        //test deposit and withdraw while activated
        System.out.println();
        myAccount.activate();
        myAccount.deposit(10000.0);
        myAccount.withdraw(5000.0);
        myAccount.withdraw(5000.0);
        myAccount.deposit(10000.0);

        //test closed account
        System.out.println();
        myAccount.close();
        myAccount.close();
        myAccount.withdraw(5000.0);
        myAccount.deposit(10000.0);

        //test activate and suspend on closed account
        System.out.println();
        myAccount.activate();
        myAccount.suspend();

        //test suspend and withdraw on closed account
        System.out.println();
        myAccount.withdraw(1000.00);
        myAccount.deposit(10000.00);





    }
}