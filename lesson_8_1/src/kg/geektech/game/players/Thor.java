package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.players.Boss;
import kg.geektech.game.players.Hero;
import kg.geektech.game.players.SuperAbility;

public class Thor extends Hero {
    public Thor(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name, ability);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean thor= RPG_Game.random.nextBoolean();
        if (thor){
            boss.setDamage(0);
        }else {
            boss.setDamage(50);
        }
    }
}



