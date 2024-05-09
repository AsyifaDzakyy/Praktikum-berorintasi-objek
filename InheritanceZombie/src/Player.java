import java.util.List;

public class Player extends Entity{
    private String name;
    private boolean playerAttackMerchant;

    public String getName() {
        return name;
    }

    public Player(int hp, int level, String name) {
        super(hp, level);
        this.name = name;
    }

    @Override
    public void entityInfo() {
        System.out.println("# PLAYER DENGAN NAMA : "+getName()+", DAN LEVEL "+getLevel());
    }

    public void attack(Zombie zombie) {
        if(getHp() > 0) {
            if(zombie.getHp()<=0) {
                System.out.println("# ZOMBIE TELAH MATI");
            } else {
                zombie.setHp(zombie.getHp()-10);
                if (zombie.getHp()==0) {
                    System.out.println("ZOMBI MATI");
                } else {
                    System.out.println("Zombie : arrghhh");
                }
            }
        } else {
            System.out.println("# PLAYER TELAH MATI");
        }

    }

    public void attack(Merchant merchant) {
        if(getHp()> 0) {
            if(merchant.getHp()<=0) {
                System.out.println("# MERCHANT TELAH MATI");
            } else {
                merchant.setHp(merchant.getHp()-10);
                playerAttackMerchant = true;
                if (merchant.getHp()==0) {
                    System.out.println("# MERCHANT MATI");
                } else {
                    System.out.println("# Merchant : Heyy ngapain nyerang");
                }
            }
        } else {
            System.out.println("# PLAYER TELAH MATI");
        }
    }


    public void interact(Merchant merchant) {
        if(getHp()>0) {
            if(merchant.getHp()<=0) {
                System.out.println("# TIDAK BISA BELI, MERCHANT TELAH MATI");
            } else if (merchant.getHp()>0 && !playerAttackMerchant) {
                System.out.println("Merchant : ");
                System.out.println("Barang yang tersedia hari ini");
                List<String> listItem = merchant.getListItem();
                for(String item : listItem){
                    System.out.println("# "+item);
                }
            } else {
                System.out.println("Merchant : Dah ah, Males Jualan");
                System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
            }
        } else {
            System.out.println("# PLAYER TELAH MATI");
        }
    }
}
