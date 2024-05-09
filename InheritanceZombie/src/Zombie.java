enum Types{
    MELEE,
    RANGED
}
public class Zombie extends Entity{
    private Types types;

    public Types getTypes() {
        return types;
    }

    public Zombie(int hp, int level, Types types) {
        super(hp, level);
        this.types = types;
    }

    @Override
    public void entityInfo() {
        System.out.println("# ZOMBIE DENGAN TIPE : "+getTypes()+", DAN LEVEL : "+getLevel());
    }

    public void attack(Player player) {
        if (getHp()>0) {
            if (player.getHp() <= 0) {
                System.out.println("# PLAYER SUDAH MATI");
            } else {
                if (getTypes() == Types.MELEE) {
                    player.setHp(player.getHp() - 20);
                    if (player.getHp()==0) {
                        System.out.println("# GAME OVER, PLAYER TELAH MATI");
                    } else {
                        System.out.println("Player : Ugghhhhh");
                    }
                } else if (getTypes() == Types.RANGED) {
                    player.setHp(player.getHp() - 10);
                    if (player.getHp()==0) {
                        System.out.println("# GAME OVER, PLAYER TELAH MATI");
                    } else {
                        System.out.println("Player : Ugghhhhh");
                    }
                }
            }
        } else {
            System.out.println("# ZOMBIE TELAH MATI");
        }
    }
}
