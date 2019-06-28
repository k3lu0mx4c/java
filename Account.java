package multi_threading.synchronization_thread.sharing_resources;

public class Account {
    private float balance;

    public void set(float amount) {
        balance = amount;
    }

    public float get() {
        return balance;
    }

    public String toString() {
        return String.format("balance: %f", balance);
    }
}
