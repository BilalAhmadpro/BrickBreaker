/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

public class OneHitBrick extends Brick
{
    
  OneHitBrick(int x,int y,String path) // creates brick that destroys with single hit
  {
      super(x,y,path);
      count1 = 0;
      count2 = 0;
  }
}
