/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


public class PaddlefirePowerup extends PowerUp
{
    
    public PaddlefirePowerup(int x, int y, String path) // creates powerup to produce fire powerup
    {
        super(x, y, path);
        this.dy = +2;
    }
}
