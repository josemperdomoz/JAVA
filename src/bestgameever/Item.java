/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestgameever;


public abstract class Item {
    public String name;
    public String description;
    public float value;
    
    public Item(String name, String desc, float val){
       this.name = name;
       this.description = desc;
       this.value = val;      
    }
    
    public void use(){}

    public String getName() { return name;}

    public String getDescription() {return description; }

    public float getValue() { return value; }
    
    public void examineItem(){
            System.out.println(name);
            System.out.println(description);
            System.out.println(value);
    }
    
    // Remember that when you print something with System.out.println() function, you are implicitly using 
    // toString() when you have parameters that are not String as an input. 
    @Override
    public String toString(){
        return "Item:\n" + name + "\n" + description + "\n" + value;
    }
}
