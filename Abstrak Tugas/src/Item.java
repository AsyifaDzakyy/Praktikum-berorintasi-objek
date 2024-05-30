abstract class Item {
    protected String name;
    protected int rank;
    protected double price;

    public Item(String name, int rank, double price) {
        this.name = name;
        this.rank = rank;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public double getPrice() {
        return price;
    }
}
