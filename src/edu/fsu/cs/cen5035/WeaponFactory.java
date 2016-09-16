/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
        	case "arrow":
        		return new Arrow();
        	case "axe":
        		return new Axe();
        	case "magicStaff";
        		return new MagicStaff();
            case "sword":
                return new Sword();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
