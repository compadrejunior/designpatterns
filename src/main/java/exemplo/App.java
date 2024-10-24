package exemplo;

public class App {
  public static void main(String[] args) {
    Order order = new Order();
    order.setId(1);
    OrderDatabaseFactory odf = new OrderDatabaseFactory();
    IOrderSaver saver = odf.createOrderDatabase();
    order.saveOrder(saver);
  }
}
