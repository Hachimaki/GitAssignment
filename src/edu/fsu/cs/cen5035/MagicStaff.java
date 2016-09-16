package edu.fsu.cs.cen5035;

/**
 *
 * @author Jonathan Clow
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    public MagicStaff() {
    	//	Magic staff has base damage of 80
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
    	//	Magic staff ignores 20% of armor
        int damage = DAMAGE - Math.round(0.8f * armor);
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
