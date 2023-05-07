/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


public class MultiballPowerup extends PowerUp
{
    
    public MultiballPowerup(int x, int y, String path) // powerup to produce multiple balls
    {
        super(x, y, path);
        this.dy = +2;
    }
    
}
