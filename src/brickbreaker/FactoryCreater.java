/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


public class FactoryCreater {

    public AbstractFactory createFactory(String factory)
    {
        if (factory.equalsIgnoreCase("PowerupFactory")) 
        {
            return new PowerupFactory();
        } else if (factory.equalsIgnoreCase("BrickFactory")) 
        {
            return new BrickFactory();
        } else {
            return null;
        }
    }

}