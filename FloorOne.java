//********************************************************************************
// PANTHERID:  [5841682]
// CLASS: COP 2210 – [ 2018]
// ASSIGNMENT # [3]
// DATE: [3/26/18]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package hauntedhouse;

import javax.swing.JOptionPane;

/**
 *
 * @author Nat PC
 */
public class FloorOne {
    
private String livingroom;
private String stairs;
private String bathroom;
private String pantry;
private String kitchen;
private String diningroom;
private String location;
private String backpack;

HouseGraphics graphics = new HouseGraphics();
Objects objects = new Objects();

public FloorOne(String location) {
    this.location = location;
}

    public void stairsToFloor2(){
        if(location.contains("stairs")) {
            FloorTwo goToFloorTwo = new FloorTwo(location);
            goToFloorTwo.stairs();
        }
    }
    
    public void livingroom(){
        if(location.contains("living room")){
          String LRLocation = JOptionPane.showInputDialog("You enter the living room and see a bathroom and a chest. Do you want to go to the bathroom or open the chest? \n Type 'bathroom' or 'chest'");
           if(LRLocation.contains("chest")) {
               objects.chest();
               graphics.LivingRoomGraphic();
               backpack = "chest";
               System.out.println("backpack =" + backpack);
           }
           else if(LRLocation.contains("bathroom")){
               location = "bathroom";
               bathroom();
               graphics.LivingRoomGraphic();
           }
        }    
    }
   
    public void bathroom(){
        if(location.contains("bathroom")) {
           String BRLocation = JOptionPane.showInputDialog("You enter the bathroom and see a mirror and a shower. Do you want to see the mirror or the shower? \n Type 'mirror' or 'shower");
           if(BRLocation.contains("mirror")) {
               objects.mirror();
               graphics.BathroomGraphic();
               backpack = "mirror";
               System.out.println("backpack =" + backpack);

           }
           else if(BRLocation.contains("shower")) {
               objects.shower();
               graphics.BathroomGraphic();
               backpack = "shower";
               System.out.println("backpack =" + backpack);

           } 
        }
    }
    
    public void diningRoom(){
        if(location.contains("dining room")) {
          String DRLocation = JOptionPane.showInputDialog("You enter the dinig room and see a candelabra and the kitchen. Do you want to see the candelabra or go to the kitchen? \n Type 'candelabra' or 'kitchen'");
          if(DRLocation.contains("candelabra")) {
              objects.candelabra();
              graphics.DiningRoomGraphic();
              backpack = "candelabra";
              System.out.println("backpack =" + backpack);
          }
          else if(DRLocation.contains("kitchen")){
           location = "kitchen";
           kitchen();   
          }
        }
    }
     
    public void kitchen(){
        if(location.contains("kitchen")) {
           String KLocation = JOptionPane.showInputDialog("You enter the kitchen and see a fridge, cabinet and the pantry. Do you want to go to the fridge, cabinet or pantry. \n Type 'fridge' or 'cabinet' or 'pantry'");
           if(KLocation.contains("fridge")) {
              objects.fridge();
              graphics.KitchenGraphic();
              backpack = "soul food";
              System.out.println("backpack:" + backpack);
           }
           else if(KLocation.contains("cabinet")) {
               objects.cabinet();
               graphics.KitchenGraphic();
               backpack = "cabinet";
               System.out.println("backpack =" + backpack);
           }
           else if(KLocation.contains("pantry")) {
               location = "pantry";
               pantry();
           }
        }
        
        
    }
    public void pantry(){
        if(location.contains("pantry")) {
          String PLocation = JOptionPane.showInputDialog("You enter the pantry and see a broom and a dusty recipy box. Do you want to see the broom or the dusty recipe box. \n Type 'broom' or 'recipe box'");
        if(PLocation.contains("broom")) {
            objects.broom();
            graphics.PantryGraphic();
            backpack = "broom";
            System.out.println("backpack =" + backpack);
        }
        else if(PLocation.contains("recipe box")) {
            objects.dustyRecipeBox();
            graphics.PantryGraphic();
            backpack = "recipe for chocolate devils food cake";
            System.out.println("backpack:" + backpack);
        }
        }
        
    }  
}
