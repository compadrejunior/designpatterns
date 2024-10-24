package exemplo;

public class Order {
    private int id;
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void saveOrder(IOrderSaver saver) {
        saver.saveOrder(this);
    }
}
