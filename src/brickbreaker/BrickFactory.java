/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class BrickFactory extends AbstractFactory 
{

    @Override
    public GameObject createObject(String object) //factory patterns
    {
        if (object.equalsIgnoreCase("oneHitBrick"))
        {
            System.out.println("onehit");
            return new OneHitBrick(0, 0, "");
        }
        if (object.equalsIgnoreCase("twoHitBrick")) 
        {
            System.out.println("twohit");
            return new TwoHitBrick(0, 0, "");
        }
        if (object.equalsIgnoreCase("threeHitBrick"))
        {
            System.out.println("threehit");
            return new ThreeHitBrick(0, 0, "");
        }
        if (object.equalsIgnoreCase("unremoveBrick"))
        {

            return new UnBreakableBrick(0, 0, "");
        } 
        else 
        {
            return null;
        }
    }



}