/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

public class Driver {
    public static void main(String[] args)
    {
        Model m = new Model();
        Controller c = new Controller(m);
        View v = new View(c);
    }
}
