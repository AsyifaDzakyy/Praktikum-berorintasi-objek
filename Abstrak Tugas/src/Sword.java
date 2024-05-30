public class Sword extends Item {
    private int damage;

    public Sword(String name, int rank, double price, int damage) {
        super(name, rank, price);
        this.damage = damage;
    }

    public String attack() {
        return "Damage dealt by " + damage;
    }
}

