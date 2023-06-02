import java.util.ArrayList;

public class Account {

    private String name;
    private String uuid;
    private User holder;
    private ArrayList<Transaction> transactions;


    public Account(String name, User holder, Bank theBank) {
        this.name = name;
        this.holder = holder;

//         get next account ID
        this.uuid = theBank.getNewAccountID();

//        init transactions
        this.transactions = new ArrayList<Transaction>();

    }

    public String getUUID(){
        return this.uuid;
    }


    public String getSummaryLine() {
//        get the balance
        double balance = this.getBalance();

//        format the summary line, depending on the whether the balance is negative
        if (balance >= 0) {
            return String.format("%s : $%.02f : %s", this.uuid, balance, this.name);
        } else {
            return String.format("%s : $%.02f : %s", this.uuid, Math.abs(balance), this.name);
        }

    }
    public double getBalance () {
        double balance = 0;
        for (Transaction t : this.transactions) {
            balance += t.getAmmount();
        }
        return balance;
    }

//    print history of acct
    public  void printTransHistory() {
        System.out.printf("\nTransaction history for account %s\n", this.uuid);
        for(int t = this.transactions.size()-1; t >= 0; t--) {
            System.out.printf(this.transactions.get(t).getSummaryLine() + "\n");
        }
        System.out.println();
    }

    public void addTransaction(double amount, String information) {
//        create new transaction object and adding to list
        Transaction newTrans = new Transaction(amount,information,this);
        this.transactions.add(newTrans);
    }
}
