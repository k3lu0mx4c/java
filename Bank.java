package multi_threading.synchronization_thread.sharing_resources;

public class Bank {
    private Account[] accounts;
    String bankName;

    // constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new Account[100];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
        }
    }

    public void booking(String employee, int accountnr, float amount) {
        float oldBalance = accounts[accountnr].get();
        float newBalance = oldBalance + amount;
        accounts[accountnr].set(newBalance);
        System.out.println(accounts[1]);
    }

}
