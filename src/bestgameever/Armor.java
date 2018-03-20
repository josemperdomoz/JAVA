/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestgameever;

import java.io.IOException;
import java.util.Properties;
 

public class Armor extends Item {
    private float weight;
    private int defence;
    private String extraBonus; 
    private String material;
    
    
    public Armor(String name, String desc, float val, float weight, int defence, String extraBonus, String material){
        super(name,desc,val);
        this.weight = weight;
        this.defence = defence;
        this.extraBonus = extraBonus;
        this.material = material;                
        }
    
    
    
    public float getWeight() {
        return weight;
    }

    public int getDefence() {
        return defence;
    }

    public String getExtraBonus() {
        return extraBonus;
    }

    public String getMaterial() {
        return material;
    }
    
    public void wield(){
        System.out.print("You have wielded the Armor :)" );            
    }
  
   public void unwield(){
       System.out.print("You have unwielded the armor :( ");
   }
   
   public void examineItem(){
            super.examineItem();
            System.out.println(weight);
            System.out.println(defence);
            System.out.println(extraBonus);
            System.out.println(material);
            
    }
   
   
   
   
   
  /* public void printArmor(){
      int n = 1;
      for( Armor i : Armor ){
            System.out.println( "Armor:" + n++ );
            System.out.println(i + "\n");
            } */
    }
    
       
   }
   
   
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
   // private Item wieldArmor() { 
       // System.out.print(" With these program you are going to wield armor ;) ");    
        // I still have to think what I need to do. It's kind of difficult for me :/     
               
    
   // private Item unwieldArmor(){
      // System.out.print(" With these program you are going to unwield armor ;) ");
  //  }
    /*
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setExtraBonus(String extraBonus) {
        this.extraBonus = extraBonus;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getWeight() {
        return weight;
    }

    public int getDefence() {
        return defence;
    }

    public String getExtraBonus() {
        return extraBonus;
    }

    public String getMaterial() {
        return material;
    } */
     

/* This part of the code is to give some values to the attributes of the armor. 
        Armor KnightArmor = new Armor();
        KnightArmor.setDefence(40); // The defence bonus of this armor is +40. 
        KnightArmor.setWeight(20); // The weight of knight armor is 20kg. 
        KnightArmor.setExtraBonus("You can do a big smash (Double Damage on Opponent)");
        KnightArmor.setMaterial("Mithril");
        
        Armor MagicianArmor = new Armor();
        MagicianArmor.setDefence(20); // The defence bonus of this armor is +20.
        MagicianArmor.setWeight(10); // The weight of knight armor is 10kg. 
        MagicianArmor.setExtraBonus("You can freeze opponent");
        MagicianArmor.setMaterial("Wool Robe");
        
        Armor ArcherArmor = new Armor();
        ArcherArmor.setDefence(30); // The defence bonus of this armor is +30.
        ArcherArmor.setWeight(15); // The weight of knight armor is 10kg. 
        ArcherArmor.setExtraBonus("You can double attack");
        ArcherArmor.setMaterial("Red Dragonhide");
        //float a = KnightArmor.getWeight()
        System.out.print("You want to know the benefits of being a Knight ;) ? ")
        System.out.printf("The defence bonus of this armor is %f . " , KnightArmor.getWeight() ) */
    
    
    
}
