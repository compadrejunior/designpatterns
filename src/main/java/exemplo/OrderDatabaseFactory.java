package exemplo;

public class OrderDatabaseFactory {

    public IOrderSaver createOrderDatabase() {
        IOrderSaver saver = new OrderDatabase();
        return saver;
    }
}
