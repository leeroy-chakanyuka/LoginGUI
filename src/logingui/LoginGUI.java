
package logingui;
import javax.swing.*;

public class LoginGUI {

    
    public static void main(String[] args) {
        
        String correctPass = "ThePassword";
        String correctUser = "Leeroy";
        
        
        int i =1; // used to track how many times height entered incorrect via a for loop
        int age;
        double height;
     
        //initial login, with option to cancel if so needed 
        String user = JOptionPane.showInputDialog("Please enter your username");
        if (user == null ) {
    JOptionPane.showMessageDialog(null, "Login canceled. Program will terminate.");
    System.exit(0); }
        
        String pass = JOptionPane.showInputDialog("Please enter your Password");
    if ( pass == null) {
    JOptionPane.showMessageDialog(null, "Login canceled. Program will terminate.");
    System.exit(0); }
    
    
        
        //verification of user credentials 
        if (user.equalsIgnoreCase(correctUser))
            {if (pass.equals(correctPass)) { //whether the password is right or not
                            JOptionPane.showMessageDialog(null, "Welcome " + correctUser); //could have used || logic to save memory  
            }
        else { // so this message will be the one you get, if one of the two are incorrect
         JOptionPane.showMessageDialog(null, "Wrong credentials. Please try again later!");  
                
            }
        }
              if (!(user.equalsIgnoreCase(correctUser))){ //triggered by the wrong username // slightly redundant
            JOptionPane.showMessageDialog(null, "We do not have those users creds signed up on our platform, please sign up!");
            {  int choice = JOptionPane.showConfirmDialog(null, "Would you Like to sign up?", "Yes or No", JOptionPane.YES_NO_OPTION);
         if(choice == JOptionPane.YES_OPTION)  
              
         
         {
           age = Integer.parseInt(JOptionPane.showInputDialog("how old are you?"));
           
           height = Double.parseDouble(JOptionPane.showInputDialog("please enter height"));
           //for(i =1;(!(height >= 100.00 && height <= 250.00));i++)
          while(!(height >= 100.00 && height <= 250.00))
           { JOptionPane.showMessageDialog(null, "Please enter a real height"); 
           height = Double.parseDouble(JOptionPane.showInputDialog("please enter height"));
           i++;}
          
           
           
           String newName = JOptionPane.showInputDialog("please enter a name"); 
           String newSur = JOptionPane.showInputDialog("please enter a surname"); 
           String newUser = JOptionPane.showInputDialog("please enter a Username");
           String newPass = JOptionPane.showInputDialog("please enter a Password"); 
           
         
       JOptionPane.showMessageDialog(null, "hello " + newName + " " + newSur + " you entered \"wrong\" height " + i + " times");

         if(height <=150.00){ JOptionPane.showMessageDialog(null, "two facts: you are " +age+ " and you are short, user :" +newUser  );}
        
         else 
         {JOptionPane.showMessageDialog(null,  "two facts: you are " +age+ " and you are short, user :" +newUser);}
           
                
        String user2 = JOptionPane.showInputDialog("Please enter your username");
        if (user2 == null ) {
    JOptionPane.showMessageDialog(null, "Login canceled. Program will terminate.");
    System.exit(0); }
        String pass2 = JOptionPane.showInputDialog("Please enter your Password");
    if ( pass2 == null) {
    JOptionPane.showMessageDialog(null, "Login canceled. Program will terminate.");
    System.exit(0); }
    
    
        
        
                   if (user2.equalsIgnoreCase(newUser))
         {if (pass2.equals(newPass)) {
              JOptionPane.showMessageDialog(null, "Welcome " + newUser);  
            }
         else {
         JOptionPane.showMessageDialog(null, "Wrong credentials. Please try again!"); 
                
            }
        }
           
     }    
    else 
    {JOptionPane.showMessageDialog(null, "Thank you, bye!");}

    int choice2 = JOptionPane.showConfirmDialog(null, "Would you Like to sign up?", "Yes or No", JOptionPane.YES_NO_OPTION);
        if(choice2 == JOptionPane.YES_OPTION) 
        {
            JOptionPane.showMessageDialog(null, "Welcome to Leeroy's Kid Library");
        
        //searchauth("The Secret Garden Gate");
        //searchis("The Secret Garden Gate");  
        
          String searchMethod = JOptionPane.showInputDialog("How would you like to look up your book? \t Name, Author or ISBN");
   while(searchMethod.isEmpty()) {
        searchMethod = JOptionPane.showInputDialog("You did not enter anything, please try again \t How would you like to look up your book? \t Name, Author or ISBN" +" \t or enter 0 to exit");
   if (searchMethod.equals("0"))
       break;}
        }
   
    }
    
            
            
}
}}