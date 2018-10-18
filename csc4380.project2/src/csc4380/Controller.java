/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

/**
 *
 * @author aaron
 */
public class Controller {
    
    private Model m;
    
    
    public Controller()
    {
        m = new Model();
    }
    
    
    //This method converts the value in the left text box to the currecny specified by
    //the right drop down.
    public void btnConvert(View v)
    {
        double leftVal = convertToUSD(Double.parseDouble(v.getLeftText()), v.getLeftDropDown());
        double rightVal = convertToNewCurrency(leftVal, v.getRightDropDown());
        v.setRightVal(rightVal+"");
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
    
    
    private double convertToUSD(double d, String rate)
    {
        double xchgRate = 1/m.getExchangeRate(rate);
        return d*xchgRate;
    }
    
    private double convertToNewCurrency(double d, String rate)
    {
        //The following method should return exch rate to go from USD to "rate"
        double xchgRate = m.getExchangeRate(rate);
        return d*xchgRate;
    }
    
    
    public static void main (String[] args) {
        View v = new View();
    }
}
