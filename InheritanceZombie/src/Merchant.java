import java.util.List;

public class Merchant extends Entity{
    private List<String> listItem;

    public List<String> getListItem() {
        return listItem;
    }

    public Merchant(int hp, int level, List<String> listItem) {
        super(hp, level);
        this.listItem = listItem;
    }

    @Override
    public void entityInfo() {
        System.out.println("# MERCHANT DENGAN LEVEL : "+getLevel());
    }
}
