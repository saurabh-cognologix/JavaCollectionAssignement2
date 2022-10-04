package JavaCollectionAssignment2.question2.model;

public class Model {
    private String customerName;
    private int price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Model(String customerName, int price) {
        this.customerName = customerName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model{" +
                "customerName='" + customerName + '\'' +
                ", price=" + price +
                '}';
    }
}
