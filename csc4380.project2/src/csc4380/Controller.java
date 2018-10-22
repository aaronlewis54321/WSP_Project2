/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.SQLException;

/**
 *
 * @author aaron
 */
public class Controller {
    
    private static Model m;
    
    
    public Controller()
    {
        m = new Model();
    }
    
    
    //This method converts the value in the left text box to the currecny specified by
    //the right drop down.
    public void btnConvert(View v)
    {
        double leftVal = convertToUSD(Double.parseDouble(v.getLeftText()), v.getLeftDropDown());
        System.out.println(leftVal);
        double rightVal = convertToNewCurrency(leftVal, v.getRightDropDown());
        System.out.println(""+rightVal);
        v.setRightVal(""+rightVal);
    }
    
    
    //Sets every text box to ""
    public void btnClear (View v)
    {
        v.setLeftVal("");
        v.setLeftDropDown("");
        v.setRightVal("");
        v.setRightDropDown("");
    }
    
    
    //This method takes the values of the two drop down's and swaps them with eachother
    public void btnSwap(View v)
    {
        String temp = v.getRightDropDown();
        v.setRightDropDown(v.getLeftDropDown());
        v.setLeftDropDown(temp);
    }
    
    public void btnEditProf(View v) {
        m.setNative(v.country);
    }
    
    
    public void btnSignup(View v)
    {
        //Make a call to the database to pass in username and verify that that username does not already exist
        //Example: m.userNameExists(String m);
        
        //Write the new username and password to the username database
        //Example: m.createUser(String uName, String pWord);
        //For this I will need a getter to get the userName and Password field for the sign up side from Michael
        
        //Display confirmation on screen?
        
        
        
    /*    if(!m.userNameExists(v.getLeftUserName()))
        {
            m.createUser(v.getLeftUserName(), v.getLeftPassword());
        }
        m.setCurrentUser(v.getLeftUserName());   */
        
        
        m.createUser(v.getSignUpUser(), v.getSignUpPass());
      
    }
    
    public void btnLogin(View v)
    {
        //Made a call to the database that takes in the username and returns the correct password, so that can be compared to 
        //the password passed in by the user
        //Example: m.getPassword(String uName);
        //For this I will need a getter to get the userName and Password field for the login side from Michael
       // if(m.userNameExists(v.getRightUserName()) && m.getPassword(v.getRightUserName()).equals(v.getRightPassword()))
        //{
         //   m.setCurrentUser(v.getRightUserName());
       // }
        
        m.login(v.getLoginUser(), v.getLoginPass());
    }
    
    
    
    
    private double convertToUSD(double d, String rate)
    {
        double xchgRate = m.getExchangeRate(rate);
        return d*xchgRate;
    }
    
    private double convertToNewCurrency(double d, String rate)
    {
        //The following method should return exch rate to go from USD to "rate"
        double xchgRate = 1/m.getExchangeRate(rate);
        return d*xchgRate;
    }
    
    
    public static void main (String[] args) {
        View v = new View();
        m.database();
    }
    
}
