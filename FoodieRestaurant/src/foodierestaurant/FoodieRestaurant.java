/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodierestaurant;

import java.util.ArrayList;
import menuItems.Inventory;
import menuItems.MainMenu;
import starting.HomepageForm;
import static starting.HomepageForm.offers;


public class FoodieRestaurant
{


    public static void main(String[] args)
    {
        // TODO code application logic here
        MainMenu.categoryList.clear();
        MainMenu mainmenu = new MainMenu();
        mainmenu.setCategoryItem(); //load main menu
        Inventory inventory = new Inventory();
        inventory.setInventoryItems(); //load inventory
        offers = new ArrayList<>();
        User.viewAnnouncements();
        HomepageForm h = new HomepageForm();
        h.setVisible(true);
    }
    
}
