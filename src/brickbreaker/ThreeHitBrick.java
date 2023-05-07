/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;


    public class ThreeHitBrick extends Brick
{
    
   public ThreeHitBrick(int x,int y,String path) // creates brick that destroys with three hits
  {
      super(x,y,path);
      count1 = 2;
      count2 = 0;
  }
}

