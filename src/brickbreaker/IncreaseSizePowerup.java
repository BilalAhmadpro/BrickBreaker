/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


public class IncreaseSizePowerup extends PowerUp
{

    public IncreaseSizePowerup(int x, int y, String path) //produces powerup to increase size of paddle
    {
        super(x, y, path);
        this.dy = +2;
    }

}