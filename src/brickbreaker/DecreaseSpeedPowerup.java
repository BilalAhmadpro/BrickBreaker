/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import javax.swing.Timer;


public class DecreaseSpeedPowerup extends PowerUp
{
    public DecreaseSpeedPowerup(int x, int y, String path) //produces poweup to decrease speed of paddle
    {
        super(x, y, path);
        
        this.dy = +2;
    }
    
    
}
