
public class BetterProgrammerTask2 {

    public static int getSumOfTwoClosestToZeroElements(int[] a) {
    	int closer = a[0];
    	int second = a[1];
    	int temp=0;
    	if(Math.abs(closer) > Math.abs(second)){
    		temp = second;
    		second = closer;
    		closer = temp;
    	}
   	   	
    	int i;
    	for(i=2;i<a.length;i++){
    		if(Math.abs(a[i])>Math.abs(closer) && Math.abs(a[i])<Math.abs(second) ){
    			second = a[i];
    			
    		}
    			
    			else if(Math.abs(a[i])<Math.abs(closer)) {
    				if(Math.abs(second) == Math.abs(closer) && second < closer)
    					second = closer;
    				closer = a[i]; }
    			else if(Math.abs(a[i]) == Math.abs(closer) && closer < a[i] ){
    				if(Math.abs(second) == Math.abs(closer) && second < closer)
    					second = closer;
    				closer = a[i];
    			}
    			else if(Math.abs(a[i]) == Math.abs(closer) && Math.abs(second) > Math.abs(a[i]) ){
    				second = a[i];
    			}
    			else if(Math.abs(a[i]) == Math.abs(second) && second < a[i] ){
    				if(Math.abs(second) == Math.abs(closer) && second > closer)
    						closer = a[i];
    					else
    						second = a[i];
    			}
    		
    		
    	}
    	
        /*
          Please implement this method to
          return the sum of the two elements closest to zero.
          If there are two elements equally close to zero like -2 and 2,
          consider the positive element to be "closer" to zero than the negative one.
         */
    	return closer+second;
    }
    
    public static void main(String []args){
    	int []a = {-20,-50,2,2,3,4,-2,-5,-1,-1,-1,1,-1};
    	System.out.println(getSumOfTwoClosestToZeroElements(a));
    	
    }
}
