//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Potion attackPotion = new Potion("Attack Potion", 1, 10.0, 5, 20, "Attack");
            Potion healPotion = new Potion("Heal Potion", 1, 15.0, 5, 25, "Heal");
            Sword sword = new Sword("Excalibur", 1, 50.0, 30);
            Shield shield = new Shield("Aegis", 1, 40.0, 20);

            System.out.println(attackPotion.use());
            System.out.println(healPotion.use());
            System.out.println(sword.attack());
            System.out.println(shield.defense());
        }
    }
