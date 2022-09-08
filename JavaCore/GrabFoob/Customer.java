public class Customer extends Person {
    private boolean block;
    private Wallet wallet;
    public Customer(int id, String name, String phone, boolean block, Wallet wallet) {
        super(id, name, phone);
        this.block = block;
        this.wallet = wallet;
    }
    
}
