import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;

public class User  {
    private String firstName;
    private String lastName;
    private String userID;
    private byte userPin[];
    private ArrayList<Account> accounts;


    public User(String firstName, String lastName, String pin, Bank theBank) throws NoSuchAlgorithmException {

//        set user's name

        this.firstName = firstName;
        this.lastName = lastName;

//         store the pin MD5 hash, rather than original value


        //adding .NoSuchAlgorithmException
        MessageDigest md = MessageDigest.getInstance("MD5");
        this.userPin = md.digest(pin.getBytes());


//        get a new, unique universal IF for the user

        this.userID = theBank.getNewUserID();

//        create empty list of accounts
        this.accounts = new ArrayList<Account>();

//        print log message
        System.out.println("New user: " + this.firstName +" " + this.lastName + " " +
                "\nID: "+ this.userID + "\n");
    }

    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }


    public String getID() {
        return this.userID;
    }
    public boolean validatePin(String aPin) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");

        return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.userPin);
    }
    public  String getFirstName(){
        return this.firstName;
    }

    public void printAccountSummary() {

        System.out.printf("\n\n%s's accounts summary\n", this.firstName);
        for (int a = 0; a < this.accounts.size(); a++){
            System.out.printf("%d) %s\n", a+1,
                    this.accounts.get(a).getSummaryLine());
        }
        System.out.println();
    }

    public int numAccount() {
        return this.accounts.size();
    }

    public void printAcctHistory(int acctIdx) {
        this.accounts.get(acctIdx).printTransHistory();
    }

    public double getAccBalance(int accIdx) {
        return this.accounts.get(accIdx).getBalance();
    }

    public String getAcctUUID(int accIdx) {
        return this.accounts.get(accIdx).getUUID();
    }

    public void addAcctTransaction(int accIdx, double amount, String information) {

        this.accounts.get(accIdx).addTransaction(amount, information);
    }

}

