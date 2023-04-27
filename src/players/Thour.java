package players;

import general.RPG_Game;

public class Thour extends Hero {
    private  int bossDefaultDamage;

    public int getBossDefaultDamage() {
        return bossDefaultDamage;
    }

    public void setBossDefaultDamage(int bossDefaultDamage) {
        this.bossDefaultDamage = bossDefaultDamage;
    }

    public Thour(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setBossDefaultDamage(50);
        if (boss.getDamage() == 0){
            boss.setDamage(this.getBossDefaultDamage());
        }
        boolean attack = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0) {
                if (attack) {
                    boss.setDamage(0);
                    System.out.println("Thor stunned the boss " + attack);
                    break;
                }
            } else {
                boss.getDamage();
                break;
            }
        }
    }
}
