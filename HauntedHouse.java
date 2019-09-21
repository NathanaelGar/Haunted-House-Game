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

public class HauntedHouse {
    
//my main method
    public static void main(String[] args) {
        
   //declaring my variables used for main  
       String userName;
       String location = "outsideHouse";
       String backpack = "empty";
  
    //prompting user for input for name and welcoming him to the game
       userName = JOptionPane.showInputDialog("Before we start what is your name?");
       JOptionPane.showMessageDialog(null, "Hi " + userName + " welcome to the Haunted House...", "Haunted House", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null, "See below to see a map of the house and where you will be starting", "Haunted House", JOptionPane.INFORMATION_MESSAGE);   

    //this is the user's starting point   
       System.out.println(
                "|--------------------|   Front Door    |" + "\n" +
                "|                             X        |" + "\n" +
                "|                                      |" + "\n" +
                "|                    |        |        |" + "\n" +
                "|    Living Room     |        |    s   |" + "\n" +
                "|                    |        |    t   |" + "\n" +
                "|                    |        |    a   |" + "\n" +
                "|                    |        |    i   |" + "\n" +
                "|                    |        |    r   |" + "\n" +
                "|                    |        |    s   |" + "\n" +
                "|-----------     ----|        |--------|" + "\n" +
                "|         |          |                 |" + "\n" +
                "| Pantry  | Bathroom |                 |" + "\n" +
                "|         |          |                 |" + "\n" +
                "|-     --------------|                 |" + "\n" +
                "|                 |                    |" + "\n" +
                "|                 |                    |" + "\n" +
                "|                 |                    |" + "\n" +
                "|     Kitchen     |     Dining Room    |" + "\n" +
                "|                 |                    |" + "\n" +
                "|                 |                    |" + "\n" +
                "|                                      |" + "\n" +
                "|                                      |" + "\n" +
                "|-----------------|--------------------|" + "\n");
       
       //first choice when user walks into the house          
       location = JOptionPane.showInputDialog("You walk inside the house and see three rooms... do you want to go the dining room, living room, or the stairs? \n Type 'dining room' or 'living room' or 'stairs'");
       
       //
       FloorOne test = new FloorOne(location);
      
       test.stairsToFloor2();
       test.livingroom();
       test.diningRoom();
       
       //game over
       JOptionPane.showMessageDialog(null, "GAME OVER\n Thanks for playing! \n See below to see which room you ended in and what was in your backpack!", "Haunted House", JOptionPane.INFORMATION_MESSAGE);   
      
    }
    
}
