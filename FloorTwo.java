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
public class FloorTwo {

private String bedroom1;
private String bathroom;
private String bedroom2;
private String masterBedroom;
private String masterBathroom;
private String location;
private String backpack = "empty";


HouseGraphics graphics = new HouseGraphics();
Objects objects = new Objects();

public FloorTwo(String location) {
    this.location = location;
}

    public void stairs() {
        if(location.contains("stairs")) {
        String floorTwoOption = JOptionPane.showInputDialog("You walk up the stairs and see three rooms. Do you want to go to bedroom one, bedroom two, or the master bedroom? \n Type 'bedroom1' or 'bedroom2' or 'masterBedroom");
            if(floorTwoOption.contains("bedroom1")) {
                location = "bedroom1";
                bedroom1();
                
            }
            else if(floorTwoOption.contains("bedroom2")) {
                location = "bedroom2";
                bedroom2v2(); 
            }
            else if(floorTwoOption.contains("masterBedroom")) {
                location = "masterBedroom";
                masterBedroom();
            }
        }
    }
    
    public void bedroom1() {
        if(location.contains("bedroom1")){
          String BR1Location = JOptionPane.showInputDialog("You walk into the first bedroom and see a bathroom, a rocking chair, and the bathroom. Do you want to go to the bathroom, see the rocking chair, or look at the window? \n Type 'bathroom' or 'chair' or 'window'");
           if(BR1Location.contains("bathroom")) {
               location = "bathroom";
               bathroom();
           }
           else if(BR1Location.contains("chair")){
               objects.rockingChair();
               graphics.bedroom1Graphic();
               backpack = "chair";
               System.out.println("backpack:" + backpack);
           }
           else if(BR1Location.contains("window")){
               objects.window();
               graphics.bedroom1Graphic();
               backpack = "window";
               System.out.println("backpack:" + backpack);
           }
        }    

    }
    
    public void bathroom() {
        if(location.contains("bathroom")){
          String BRLocation = JOptionPane.showInputDialog("You walk into the bathroom. Do you want to go see the mirror, go to the shower, or go to bedroom two? \n Type 'bedroom2' or 'mirror' or 'shower'");
           if(BRLocation.contains("mirror")) {
               objects.mirror();
               graphics.bathroom2Graphic();
               backpack = "mirror";
               System.out.println("backpack:" + backpack);

           }
           else if(BRLocation.contains("shower")){
               objects.shower2();
               graphics.bathroom2Graphic();
               backpack = "shower";
               System.out.println("backpack:" + backpack);

           }
           else if(BRLocation.contains("bedroom2")) {
               location = "bedroom2";
               bedroom2();
           }
        }
    }
    
    public void bedroom2() {
        if(location.contains("bedroom2")){
          String BR2Location = JOptionPane.showInputDialog("You walk to in the second bedroom, you see doll house, dresser and the master bedroom. Do you want to go see the doll house, the dresser, or go to master bedroom? \n Type 'doll house' or 'dresser' or 'master bedroom'");
           if(BR2Location.contains("doll house")) {
               objects.dollHouse();
               graphics.bedroom2Graphic();
               backpack = "doll house";
               System.out.println("backpack:" + backpack);

           }
           else if(BR2Location.contains("dresser")){
               objects.dresser();
               graphics.bedroom2Graphic();
               backpack = "dresser";
               System.out.println("backpack:" + backpack);

           }
           else if(BR2Location.contains("master bedroom")) {
               location = "masterBedroom";
               masterBedroom();
           }
        }
    }
    
    public void bedroom2v2(){
        if(location.contains("bedroom2")){
          String BR2Location = JOptionPane.showInputDialog("You walk to in the second bedroom, you see doll house, dresser and the bathroom. Do you want to go see the doll house, the dresser, or go to the bathroom? \n Type 'doll house' or 'dresser' or 'bathroom'");
           if(BR2Location.contains("doll house")) {
               objects.dollHouse();
               graphics.bedroom2Graphic();
               backpack = "doll house";
               System.out.println("backpack:" + backpack);

           }
           else if(BR2Location.contains("dresser")){
               objects.dresser();
               graphics.bedroom2Graphic();
               backpack = "dresser";
               System.out.println("backpack:" + backpack);

           }
           else if(BR2Location.contains("bathroom")) {
               location = "bathroom";
               bathroomv2();
           }
        }
    }
    
      public void bathroomv2(){
        if(location.contains("bathroom")){
          String BRLocation = JOptionPane.showInputDialog("You walk into the bathroom. Do you want to go see the mirror, go to the shower, or go to bedroom one? \n Type 'bedroom1' or 'mirror' or 'shower'");
           if(BRLocation.contains("mirror")) {
               objects.mirror2();
               graphics.bathroom2Graphic();
               backpack = "mirror";
               System.out.println("backpack:" + backpack);

           }
           else if(BRLocation.contains("shower")){
               objects.shower2();
               graphics.bathroom2Graphic();
               backpack = "shower";
               System.out.println("backpack:" + backpack);

           }
           else if(BRLocation.contains("bedroom1")) {
               location = "bedroom1";
               bedroom1v2();
           }
        }
    }
      
    public void bedroom1v2() {
        if(location.contains("bedroom1")){
          String BR1Location = JOptionPane.showInputDialog("You walk into the first bedroom and see a window, a rocking chair, and the master bedroom. Do you want to go to the master bedroom, see the rocking chair, or look at the window? \n Type 'masterBedroom' or 'chair' or 'window'");
           if(BR1Location.contains("masterBedroom")) {
               location = "masterBedroom";
               masterBedroom();
           }
           else if(BR1Location.contains("chair")){
               objects.rockingChair();
               graphics.bedroom1Graphic();
               backpack = "chair";
               System.out.println("backpack:" + backpack);

           }
           else if(BR1Location.contains("window")){
               objects.window();
               graphics.bedroom1Graphic();
               backpack = "window";
               System.out.println("backpack:" + backpack);

           }
        } 
    }
    
    public void masterBedroom() {
        if(location.contains("masterBedroom")){
          String MBRLocation = JOptionPane.showInputDialog("You walk into the master bedroom. Do you want to go to the master bathroom or open the jewelry box? \n Type 'masterBathroom' or 'box'");
           if(MBRLocation.contains("masterBathroom")) {
               location =  "masterBathroom";
               masterBathroom();
           }
           else if(MBRLocation.contains("box")){
               objects.jewerlyBox();
               graphics.masterBedroomGraphic();
               backpack = "jewelry box";
               System.out.println("backpack:" + backpack);
           }
        }   
    }
    
    public void masterBathroom() {
        if(location.contains("masterBathroom")){
          String MBathRLocation = JOptionPane.showInputDialog("You walk into the master bathroom. Do you want to go see the intricate oil lamp, or go to the shower? \n Type 'lamp or 'shower'");
           if(MBathRLocation.contains("lamp")) {
               objects.intricateOilLamp();
               graphics.masterBathroomGraphic();
               backpack = "lamp";
               System.out.println("backpack:" + backpack);

           }
           else if(MBathRLocation.contains("shower")){
               objects.shower3();
               graphics.masterBathroomGraphic();
               backpack = "shower";
               System.out.println("backpack:" + backpack);

           }
        }
        
    } 
}
