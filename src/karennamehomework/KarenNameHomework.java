/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karennamehomework;

import inpututilities.InputUtilities;

/**
 *
 * @author Administrator
 */
public class KarenNameHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        	//Ask the user to enter their name
	//Check that the user has entered text (no numbers allowed). You *must* use InputUtilities to do this!
 //If they enter text, then use STRING METHODS to change the name in some way YOU DECIDE (see note below)
    /**
     * @param args the command line arguments
     */
    
        
        InputUtilities inputUtilities = new InputUtilities(); //import Input utilities to get the utilities
        String name = inputUtilities.askUserForText("Please, enter your name"); //ask user to insert their name 
        System.out.println ("GREAT!!, you have a lovely name"); 
        System.out.println("Uppercase name: " + name.toUpperCase()); // instruction to change name to uppercase
        
        String newName = ""; //open a new variable for camel case 
        for (int i = 0; i < name.length(); i = i + 1) { // loop to open a camel case condition 
            if (i%2==0) {   //condition for  camel case lowecase 
                newName = newName + name.substring(i, i+1).toLowerCase();
            } else { //condition for  camel upper lowecase 
                newName = newName + name.substring(i, i+1).toUpperCase(); 
            }
        }
        System.out.println("Camel case: " + newName); 


    }
}
    
    
    
    
   

