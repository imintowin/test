public class BetterProgrammerTask3 {

    public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
    	
    	String []str = s.split(" ");
    	int i;
    	int []a = new int[str.length];
    	int c = 0;
    	int sum = 0;
    	for(i=0;i<str.length;i++){
    		if(isNumeric(str[i].trim()))
    			a[c] = Integer.valueOf(str[i].trim());
    			c++;
    	}
    	for(i = 0;i<a.length;i++){
    		sum += a[i];
    	}
    	
    	return sum;
    }
    
    public static boolean isNumeric(String str)
    {

      return str.matches("-?\\d+(\\d)?");  //match a number with optional '-' and decimal.

    }
    
    public static void main(String []args){
    	String a = "aaa 12 some text -3 0 1 1- 3424fdsfds7  423.34";
    	System.out.println(getSumOfNumbers(a));
    	
    }
    
}
