/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


public class ExtraLifePowerup extends PowerUp
{
    
    public ExtraLifePowerup(int x, int y, String path) // produces powerup to gain life
    {
        super(x, y, path);
        this.dy = +2;
    }
    
}
