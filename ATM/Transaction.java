import java.util.Date;

public class Transaction {

    private double amount;
    private Date timestamp;
    private String information;
    private Account inAccount;

    private Transaction(double amount, Account inAccount) {
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.information = "";
    }

    public Transaction(double amount, String information, Account inAccount){
//        call from 1st constructor
        this(amount, inAccount);
//        set the info
        this.information = information;
    }

    public double getAmmount() {
        return this.amount;
    }
    public String getSummaryLine(){
        if(this.amount >= 0) {
            return String.format("%s : $%.02f : %s", this.timestamp.toString(),
                    this.amount, this.information);
        }else {
            return String.format("%s : $(%.02f) : %s",this.timestamp.toString(),
                    -this.amount, this.information);
        }
    }
}
