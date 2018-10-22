/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author aaron
 */
public class Model implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    String currentUser;
    
    public Model() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    
    
    /*
    //This method should take in a string, of the format "US Dollars", "British Pounds" , etc
    // and should be able to return the exchange rate from USD to String rate.
    */
    double getExchangeRate(String rate) {
        return 0;
    }

    boolean userNameExists(String uName) {
        return true;
    }

    void createUser(String uName, String password) {
        
    }

    void setCurrentUser(String user) {
        currentUser = user;
    }
    
}
