package lmp;

import java.util.ArrayList;
import java.util.Random;

/**
 * Part C
 * Simulate for a given value of Lambda, the average number of slot times needed
 * before a successful transmission, called the contention interval.
 * @author T-CAPS
 */
public class LMP2 {
    private static final int NUM_OF_NODES = 20; // the # of stations to transmit between
    private static final int TIMES_TO_RUN = 100; // how times to simulate transmission between the # of stations
    private static final int MAX_LAMBDA = 20;
    private static Random rand;
    /**
     * @param args the command line arguments
     */
   
    public static ArrayList simulate(int nodes)
    {
		return null; //don't know what to put for now
    }
    
    /**
     * This gives our random variable
     * @param lambda the lambda value
     * @return random variable
     */
    public static double Poisson(double lambda)
    {
    	double u = 0;
    	double val;
    	
    	while (u == 0)
    	{
    	  //u = Math.random()/Double.MAX_VALUE;
          u = rand.nextDouble()/Double.MAX_VALUE;
    	}
    	
    	val = - Math.log(u)*lambda;
    	
    	return val;
    }
    
    public boolean simulate(double lambda)
    {
        double current = 0;
        double next = 0;
        double prev = -1;
        current = Poisson(lambda);
        next = current + Poisson(lambda);
        
        if(next < current)
        {
            next = current + Poisson(lambda);
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
    	
    	System.out.println("THUNDERCATS! HO!");
        
    }
    	
}