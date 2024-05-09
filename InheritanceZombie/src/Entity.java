public class Entity {
    private int hp;
    private int level;

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public Entity(int hp, int level) {
        this.hp = hp;
        this.level = level;
    }

    public void entityInfo(){
        System.out.println("Entity memiliki HP "+getHp()+" dan Level " + getLevel() );
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
