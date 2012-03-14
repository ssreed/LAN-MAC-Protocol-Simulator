/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lmp;

/**
 *
 * @author T-CAP
 */
public class Node {
    private int k, collisionCount;
    private static final double BACKOFF_CONSTANT = 51.2; // μseconds! 
    
    /**
     * Instantiate a network node
     */
    public Node()
    {
        k=0;
    }
    /**
     * 
     * @param initial - In case one would want a different
     *      initial value for k
     */
    public Node(int initial)
    {
        k=initial;
    }
    
    /**
     * 
     * @return 
     */
    public double backoff()
    {
    	k += Math.random() % 2; // Randomly decides if k will be incremented or not
        return k*BACKOFF_CONSTANT;
    }
    
    /**
     * 
     * @return 
     */
    public boolean transmit(int time) // What are we actually transmitting?
    {
//        if(true)
//        {
//            clear();
//            return true;
//        }
//        else
//        {
//            backoff();
//            return false;
//        }
        return k == time;
    }
    
    
    /**
     * 
     * @return 
     */
    public boolean clear()
    {
        k=0;
        collisionCount = 0;
        return true;
    }
}
