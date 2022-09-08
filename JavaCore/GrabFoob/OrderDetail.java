import java.util.Map;
public class OrderDetail {
    private int id;
    private Customer customer;
    private Store store;
    private Shipper shipper;
    private Map <Food, Integer> foods;
    public OrderDetail(int id, Customer customer, Store store, Shipper shipper, Map<Food, Integer> foods) {
        this.id = id;
        this.customer = customer;
        this.store = store;
        this.shipper = shipper;
        this.foods = foods;
    }
    
}
