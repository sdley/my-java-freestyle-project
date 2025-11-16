package advanced;

public class Product<T, U> {

    private T name;
    private U price;

    public Product(T name, U price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getPrice() {
        return price;
    }

    public void setPrice(U price) {
        this.price = price;
    }
}
