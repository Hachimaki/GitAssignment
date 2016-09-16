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
public class RoleGame {

    public static void main(String[] args) {
    	//	Variable to track max armor value used
    	int armor = 20;
    	
    	//	Sword
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        System.out.println("Sword was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //	Arrow
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //	Axe
        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage.");
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //	Magic staff
        Weapon magicStaff = WeaponFactory.getWeapon("magicStaff");
        System.out.println("Magic staff has " + magicStaff.hit() + " of damage.");
        System.out.println("Magic staff was able to do " + magicStaff.hit(armor) + " of damage due to an armor with "+armor+ " points.");
    }
}
