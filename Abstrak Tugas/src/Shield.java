public class Shield extends Item {
    private int damageBlock;

    public Shield(String name, int rank, double price, int damageBlock) {
        super(name, rank, price);
        this.damageBlock = damageBlock;
    }

    public String defense() {
        return "Damage Mitigated by " + damageBlock;
    }
}
