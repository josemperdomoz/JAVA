/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
check 
 */
package bestgameever;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.*;




public class BestGameEver {


    public static void main(String[] args) {
        Item a = new Armor("Adamant Chest Armor", "A badass armor!",1.1f,15,20,"This weapon gives you +20 defence bonus","Adamant");
        Item a2 = new Armor("Rune Chest Armor", "A even more badass armor!",1.2f,18,25,"This weapon gives you +25 defence bonus","Rune");
        // In order to use a as a weapon, we have to cast it as a weapon.
        Armor b = (Armor)a;
        Armor b2 = (Armor)a2;
        Player jose = new Player();
        // We can add the armor we just created to the player's inventory.
        jose.addItem(b);
        jose.addItem(b2);
        
        jose.getInventory().showInventory();
        
        b.wield();
        System.out.println("\n");
        //b.examineItem();
        b2.examineItem();
         
   }

        
    
    
}
