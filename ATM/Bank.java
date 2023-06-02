import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private ArrayList<User> user;
    private ArrayList<Account> accounts;


    public Bank(String name){
        this.name = name;
        this.accounts = new ArrayList<Account>();
        this.user = new ArrayList<User>();
    }
    public String getNewUserID(){
//      inits
        String id;
        Random rng = new Random();
        int idLength = 4;
        boolean nonUnique;
//        continue untill we get a unique id
        do {
//        generate number
            id = "";
            for (int c= 0; c<idLength;c++){
                id += ((Integer)rng.nextInt(10)).toString();
            }
//            check if it's unique
            nonUnique = false;

            for(User u : this.user){
                if(id.compareTo(u.getID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }

        }while (nonUnique);

        return id;
    }

    public String getNewAccountID(){
//      inits
        String uuid;
        Random rng = new Random();
        int accLength = 8;
        boolean nonUnique;
//        continue untill we get a unique id
        do {
//        generate number
            uuid = "";
            for (int c= 0; c<accLength;c++){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
//            check if it's unique
            nonUnique = false;

            for(Account a : this.accounts){
                if(uuid.compareTo(a.getUUID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }

        }while (nonUnique);

        return uuid;
    }
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    public User addUser(String firstNAme, String lastName, String pin) throws NoSuchAlgorithmException {
//        create a new user and add to list

        User newUser = new User(firstNAme, lastName, pin, this);
        this.user.add((newUser));

//        create saving accounts for the user and add new user to the bank
        Account newAccount = new Account("Savings", newUser, this);

        newUser.addAccount(newAccount);
        this.accounts.add(newAccount);

        return newUser;
    }
    public User UserLogin(String userID, String pin) throws NoSuchAlgorithmException {

//        search through list
        for(User u : this.user) {

//            check user ID is correct
            if(u.getID().compareTo(userID) == 0 && u.validatePin(pin)){
                return u;
            }
        }
//      no user or wrong pin

        return null;
    }
    public String getName(){
        return this.name;
    }


}

