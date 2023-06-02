import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class ATM {
    static double availableFounds = 1000;
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);


        Bank theBank = new Bank("Bank Szmalenium");
// add users to the bank
        User aUser = theBank.addUser("Jarosław", "Ps79ikuta", "1234");
        User bUser = theBank.addUser("Aleksandra", "Kowalska", "12345");

// add checking accounts for users
        Account accountA = new Account("Checking", aUser, theBank);
        aUser.addAccount(accountA);
        theBank.addAccount(accountA);

        Account accountB = new Account("Checking", bUser, theBank);
        bUser.addAccount(accountB);
        theBank.addAccount(accountB);

        User curUser;
        while (true) {
//            stay in the login prompt until success or 3 failed
            curUser = ATM.mainMenuPrompt(theBank, sc);
//            stay in menu till user quit
            ATM.printUserMenu(curUser, sc);
        }
    }

    public static User mainMenuPrompt(Bank theBank, Scanner sc) throws NoSuchAlgorithmException {
//        inits
        String userID;
        String pin;
        User authUser;
//        prompt the user for the user ID/pin untill correct
        do {
            System.out.printf("\n%s\n", theBank.getName());
            System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());
            System.out.println("Enter user ID: ");
            userID = sc.nextLine();
            System.out.println("Enter pin: ");
            pin = sc.nextLine();
//            try to get user object corresponding to the ID and pin combo
            authUser = theBank.UserLogin(userID, pin);
            if (authUser == null) {
                System.out.println("Incorrect user ID/PIN. \n");
            }
        } while (authUser == null); // continue looping 3 times

        return authUser;
    }

    public static void printUserMenu(User theUser, Scanner sc) {
//        print a summary of the user account
        theUser.printAccountSummary();

//        init
        int choice;
//        use manu
        do {
            System.out.printf("Welcome %s", theUser.getFirstName() + "!\n");
            System.out.println(" 1) Show Account transaction history");
            System.out.println(" 2) Withdraw");
            System.out.println(" 3) Deposit");
            System.out.println(" 4) Transfer");
            System.out.println(" 5) Quit");
            System.out.println();
            System.out.println("Enter choice: ");
            choice = sc.nextInt();


            if (choice < 1 || choice > 5) {
                System.out.println("Wrong number! Choose 1-5");
            }

            }while (choice < 1 || choice > 5) ;
//            process the choice
        switch (choice) {
            case 1 -> ATM.showTransactionHistory(theUser, sc);
            case 2 -> ATM.withdrawFunds(theUser, sc);
            case 3 -> ATM.depositFunds(theUser, sc);
            case 4 -> ATM.transferFunds(theUser, sc);
            case 5 ->
                //        gobble up rest of precious input
                    sc.nextLine();
        }
//            redisplay this menu unless the user wants to quit
        if (choice != 5) {
            ATM.printUserMenu(theUser, sc);
        }
    }

    private static void depositFunds(User theUser, Scanner sc) {

        int toAcct;
        double amount;
        double accBal;
        String information;
//         get the account to transfer from
        do {
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to deposit in: ", theUser.numAccount());
            toAcct = sc.nextInt() - 1;
            if (toAcct < 0 || toAcct >= theUser.numAccount()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (toAcct < 0 || toAcct >= theUser.numAccount());
        accBal = theUser.getAccBalance(toAcct);
        //        get the amount to transfer
        do {
            System.out.printf("Enter the amount to deposit : $",
                    accBal);
            amount = sc.nextDouble();
            if (amount < 0) {
                System.out.printf("Amount must be greater than zero");
            }
        } while (amount < 0);
//        gobble up rest of precious input
        sc.nextLine();
//        get the info
        System.out.println("Enter a description: ");
        information = sc.nextLine();
//        do the withdrawal
        theUser.addAcctTransaction(toAcct, amount, information);
    }


    private static void withdrawFunds(User theUser, Scanner sc) {
        int fromAcct;
        double amount;
        double accBal;
        String information;
        //ATM money
        //double availableFounds = 1000;
//         get the account to transfer from
        do {
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to withdraw from: ", theUser.numAccount());
            fromAcct = sc.nextInt() - 1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccount()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (fromAcct < 0 || fromAcct >= theUser.numAccount());
        accBal = theUser.getAccBalance(fromAcct);
//        checking if acct is empty
        if (accBal == 0) {
            System.out.println("Insufficient funds. Unable to make a withdrawal from an empty account.");
            return;
        }
        //        get the amount to transfer
        do {
            System.out.printf("Enter the amount to withdraw (max $%.2f) : $",
                    accBal);
            amount = sc.nextDouble();
            if (amount < 0) {
                System.out.printf("Amount must be greater than zero");
            }if (amount > availableFounds){
                System.out.println("Insufficient funds in ATM, Sorry for the inconvenience");
            }
            else if (amount > accBal) {
                System.out.printf("Account must not be greater than " +
                        "balance of $%.2f \n", accBal);
            }
        } while (amount < 0 || amount > accBal || amount > availableFounds);
//        gobble up rest of precious input2
        sc.nextLine();
//        get the info
        System.out.println("Enter a description: ");
        information = sc.nextLine();
//        do the withdrawal
        theUser.addAcctTransaction(fromAcct, -1 * amount, information);
        availableFounds -= amount;
    }

    private static void transferFunds(User theUser, Scanner sc) {
//        inits
        int fromAcct;
        int toAcct;
        double amount;
        double accBal;
//         get the account to transfer from
        do {
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to transfer from: ", theUser.numAccount());
            fromAcct = sc.nextInt() - 1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccount()) {
                System.out.println("Invalid account. Please try again.");
            }

        } while (fromAcct < 0 || fromAcct >= theUser.numAccount());
        accBal = theUser.getAccBalance(fromAcct);

        //  checking if acct is empty
        if (accBal == 0) {
            System.out.println("Insufficient funds. Unable to transfer from an empty account.");
            return;
        }
//        get the acct to transfer to;
        do {
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to transfer to: ", theUser.numAccount());
            toAcct = sc.nextInt() - 1;
            if (toAcct < 0 || toAcct >= theUser.numAccount()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (toAcct < 0 || toAcct >= theUser.numAccount());
//        get the amount to transfer
        do {
            System.out.printf("Enter the amount to transfer (max $%.02f) : $",
                    accBal);
            amount = sc.nextDouble();
            if (amount < 0) {
                System.out.printf("Amount must be greater than zero");
            } else if (amount > accBal) {
                System.out.printf("Account must not be greater than" +
                        "balance of $%02f.\n", accBal);
            }
        } while (amount < 0 || amount > accBal);


//        finally do the transfer

        theUser.addAcctTransaction(fromAcct, -1 * amount, String.format("Transfer to account %s",
                theUser.getAcctUUID(toAcct)));

        theUser.addAcctTransaction(toAcct, amount, String.format("Transfer to account %s",
                theUser.getAcctUUID(fromAcct)));
    }

    private static void showTransactionHistory(User theUser, Scanner sc) {

        int theAcct;

//        get acct whose transaction history to look at
        do {
            System.out.printf("Enter the number (1-%d) of the account" +
                    " whose transactions you want to see: ", theUser.numAccount());
            theAcct = sc.nextInt() - 1;
            if (theAcct < 0 || theAcct >= theUser.numAccount()) {
                System.out.println("Invalid account. Please try again.");
            }
        } while (theAcct < 0 || theAcct >= theUser.numAccount());
//        print the history of transaction
        theUser.printAcctHistory(theAcct);
    }
}