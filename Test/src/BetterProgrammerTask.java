
public class BetterProgrammerTask {

    public static double getProbability(int Y, int X) {
        /*
          If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
          To calculate that you should divide the number of comibnations with X or more 4s
          by the total number of possible combinations.
         */
    	double five = 5/6d;
    	double one = 1/6d;
    	double result = 1;
    	if(X>Y || Y==0)
    		return 0;
    	else
    		if(X==0 && Y>0)
    			return  (5 / (Math.pow(6,Y)));
    	else
    	{
    		if(X==Y)
    		{
    				return (1 / (Math.pow(6, Y)));
    		}
    		else
    		{
    			for(int i=0;i<X;i++)
    			{
    				result -= choose(6,i) * (Math.pow(one, i)) * (Math.pow(five, Y-i));
    			}
    		}
    			
    		return result;
    		
    	}
    }
    
    
    public static long choose(long total, long choose){
        if(total < choose)
            return 0;
        if(choose == 0 || choose == total)
            return 1;
        return choose(total-1,choose-1)+choose(total-1,choose);
    }
    
    public static void main(String []args){
    	//System.out.println(Math.pow(5/6d, 1));
    	System.out.println(getProbability(6,3));
    	
    }
}
