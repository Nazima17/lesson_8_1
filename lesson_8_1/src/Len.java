import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Len extends Hero {


    public Len(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        System.out.println("Я устал сражаться");
    }
}