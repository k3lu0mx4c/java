package multi_threading.synchronization_thread.sharing_resources;

public class BankOperation {
    public static void main(String[] args) {
        Bank agribank = new Bank("Agribank");
        BankEmployee tom = new BankEmployee("Tom", agribank);
        BankEmployee jerry = new BankEmployee("Jerry", agribank);
    }
}
