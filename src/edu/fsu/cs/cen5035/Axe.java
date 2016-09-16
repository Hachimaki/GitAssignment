package edu.fsu.cs.cen5035;

/**
 *
 * @author Jonathan Clow
 */
public class Axe extends BasicWeapon implements Weapon {

    public Axe() {
    	//	Axe has base damage of 60
        super(60);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
    	int damage;
    	
    	if (armor > 0 && armor < 20) {
    		//	If armor is greater than 0 and less than 20, ignore
    		damage = DAMAGE;
    	}
    	else {
    		//	Otherwise, apply the armor
    		damage = DAMAGE - armor;
    	}
        
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
