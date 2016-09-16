package edu.fsu.cs.cen5035;

/**
 *
 * @author Jonathan Clow
 */
public class Arrow extends BasicWeapon implements Weapon {

    public Arrow() {
    	//	Arrow has base damage of 70
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
    	//	Arrow ignores 5 pts. armor
        int damage = DAMAGE - (armor - 5);
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
