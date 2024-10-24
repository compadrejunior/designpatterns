package exemplo;

public class OrderDatabase implements IOrderSaver {
  public void saveOrder(Order order) {
    System.out.println("Salvou");
  }
  
}
