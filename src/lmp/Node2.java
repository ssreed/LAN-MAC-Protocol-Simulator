package lmp;

import java.util.Random;

/**
 *
 * @author firen
 */
public class Node2 implements Comparable<Node2> {
    //private static double LAMBDA = 20.0; //added temporarily to test
    private static double time; //TIME TO SEND
    private static double lambda;
    /**
     * Initializes a new Node at time t
     */
    public Node2(double aLambda)
    {
        lambda = aLambda;
        time = Poisson(lambda);
        
    }

    /**
     * This gives our random variable
     * @param lambda the lambda value
     * @return random variable
     */
    public double Poisson(double aLambda)
    {
    	double u = 0;
    	double val;
    	
        u = Math.random();  
         
        val = (-1) * lambda * Math.log(u); // x= -λ log u
        return val;
    }
    
    /**
     * Adds Poisson X value to current time
     */
    public double send(double aLambda)
    {
        time += Poisson(lambda);
        return time;
    }

    public int compareTo(Node2 o) 
    {
        return this.compareTo(o);
    }
    
    public double getLambda()
    {
        return lambda;
    }
    
    public double getTime()
    {
        return time;
    }
   
    /**
     * This gives our random variable
     * @param lambda the lambda value
     * @return random variable
     */
   /* public static double Poisson(double lambda)
    {
    	double u = 0;
    	double val;
    	Random rand;
    	rand = new Random();
    	double max = Double.MAX_VALUE;
    	double min = Double.MIN_VALUE;
    	
    	while (u == 0)
    	{
           
    	  //u = Math.random()/Double.MAX_VALUE;;
          //u = rand.nextInt();
    		u = (min + (Math.random() * ((max - min) + 1))) / Double.MAX_VALUE;
          //System.out.println("val IS: " + u);
    	}
    	val = - Math.log(u)*lambda; // x= -λ log u
        //System.out.println("val IS: " + val);
    	
    	
    	return val;
    }
    */
}
