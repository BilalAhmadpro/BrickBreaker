/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


public class DecreaseSizePowerup extends PowerUp
{
    
    public DecreaseSizePowerup(int x, int y, String path) //produces powerup to decrease size
    {
        super(x, y, path);
        this.dy = +2;
    }
    
}
