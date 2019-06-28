package multi_threading.synchronization_thread.sharing_resources;

public class BankEmployee extends Thread {
    private Bank bank;
    public String name;

    public BankEmployee(String name, Bank bank) {
        super(name);
        this.bank = bank;
        this.name = name;
        start();
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println(getName());
            int accountnr = 1;
            float amount = 1;
            bank.booking(name, accountnr, amount);
        }
    }
}
