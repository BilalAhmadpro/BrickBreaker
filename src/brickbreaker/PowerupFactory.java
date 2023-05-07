/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


public class PowerupFactory extends AbstractFactory
{

    @Override
    public GameObject createObject(String object) 
    {
    
        if(object.equalsIgnoreCase("IncreaseSizePowerup"))
        {
            return new IncreaseSizePowerup(0,0,"src/sprites/47-Breakout-Tiles.png");
        }
        else if(object.equalsIgnoreCase("DecreaseSizePowerup"))
        {
            return new DecreaseSizePowerup(0,0,"src/sprites/46-Breakout-Tiles.png");
        }
        else if(object.equalsIgnoreCase("IncreaseSpeedPowerup"))
        {
            return new IncreaseSpeedPowerup(0,0,"src/sprites/42-Breakout-Tiles.png");
        }
        else if(object.equalsIgnoreCase("DecreaseSpeedPowerup"))
        {
            return new DecreaseSpeedPowerup(0,0,"src/sprites/41-Breakout-Tiles.png");
        }
        else if(object.equalsIgnoreCase("MultiballPowerup"))
        {
            return new MultiballPowerup(0,0,"src/sprites/43-Breakout-Tiles.png");
        }
        else if(object.equalsIgnoreCase("FireballPowerup"))
        {
            return new FireballPowerup(0,0,"src/sprites/44-Breakout-Tiles.png");
        }
        else if(object.equalsIgnoreCase("ExtraLifePowerup"))
        {
            return new ExtraLifePowerup(0,0,"src/sprites/49.png");
        }
        else if(object.equalsIgnoreCase("PaddleFirePowerup"))
        {
            return new PaddlefirePowerup(0,0,"src/sprites/48-Breakout-Tiles.png");
        }
        else
        {
            return null;
        }
    }
    
}
