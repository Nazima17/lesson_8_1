import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public  class Golem extends Hero {
    private int defender;

    public Golem(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name, ability);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() == 0 && heroes[i].getHealth() > 0 && this != heroes[i]) {
                defender = boss.getDamage();
                heroes[i].setHealth(heroes[i].getHealth() - this.defender);
                heroes[i].setHealth(heroes[i].getHealth() - this.defender);
            }else {
                defender = boss.getDamage()/5;
                heroes[i].setHealth(heroes[i].getHealth()-this.defender);

            }
    }}
}