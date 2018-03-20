
package bestgameever;

import java.util.ArrayList;


/**
 *
 * @author Jose
 */

public class Player {
    private Inventory inventory;
    
    public Player(){
        inventory = new Inventory();
    }
    
    public void addItem( Item adamantChestArmor ){
        inventory.addItem( adamantChestArmor );
    }

    public void showInventory() {
        inventory.showInventory();
    }
    
    public Inventory getInventory(){
        return inventory;
    }
    
    
    
}
