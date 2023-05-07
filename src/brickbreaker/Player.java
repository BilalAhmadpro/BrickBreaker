/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import java.awt.event.KeyEvent;
import java.io.Serializable;

/*
Player class which gets the control of the game
*/


public class Player implements Serializable
{
    String firstName;
    String lastName;
    private static Player player;
    private Paddle paddle;
    private Player(String firstname, String lastname) 
    {
        this.firstName = firstname;
        this.lastName = lastname;
    }
    public void getPaddle(Paddle paddle)
    {
        this.paddle = paddle;
    }
    public static Player getInstance() 
    {
        if (player == null)
        {
            player = new Player("Bilal ", "Ahmad");
        }
        return player;
    }
    public void keyPressed(KeyEvent e)
    {
        paddle.keyPressed(e);
    }
    public void keyReleased(KeyEvent e) 
    {
        paddle.keyReleased(e);
    }
}