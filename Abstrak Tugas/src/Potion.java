public class Potion extends  Item{
    private int duration;
    private int effectPoint;
    private String type;

    public Potion(String name, int rank, double price, int duration, int effectPoint, String type) {
        super(name, rank, price);
        this.duration = duration;
        this.effectPoint = effectPoint;
        this.type = type;
    }

    public String use() {
        if ("Attack".equalsIgnoreCase(type)) {
            return "Damage dealt by " + effectPoint;
        } else if ("Heal".equalsIgnoreCase(type)) {
            return "Healed by " + effectPoint;
        } else {
            return "Invalid potion type";
        }
    }
}
