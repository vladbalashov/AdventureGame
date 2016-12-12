/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

/**
 *
 * @author vladbalashov
 */
public class FinalStageView extends View {
    
   public FinalStageView(){
   super (
                 "\n"
                  + "\n----------------------------------------------------"
                  + "\n| Thank you for saving us. You are our hero forever!"
                  + "\n| You gave us hope for bright future. We are in debt"
                  + "\n| before you forever!"
                  + "\n|You are welcome to live here. There is always place"
                  + "\n| for you and your friends in our land!"
                  + "\n----------------------------------------------------"
                  + "\nPress E to Exit game"
                  + "\n---------------------------------");
    }

@Override
    public boolean doAction(String value){
        value = value.toUpperCase();

        switch(value) {
            
            case "E":
               System.exit(0);
               break;
            default: 
                System.out.println("\n*** Invalid selection *** Try again");
                break;

}
return false;
}   

    
}
