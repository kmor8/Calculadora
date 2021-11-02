package businessLogic;


public class calculadoraPrincipal {
	 public static float add(float a, float b)
	    {
	        return a+b;
	    }
	    
	    public static float substract(float a, float b)
	    {
	        return a-b;
	    }
	    
	    public static float multiply(float a, float b)
	    {
	        return a*b;
	    }
	    
	    public static float div(float a, float b)
	    {
	        return a/b;
	    }
	    
	    public static float mod(float a,float b)
	    {
	    	return a%b;
	    }
	    
	    public static float tenPow(float a)
	    {
	    	return (float) Math.pow(10, a);	
	    }
	    
	    public static float sqrt(float a)
	    {
	    	return  (float)Math.sqrt(a);	
	    }
	    
	    public static float nFact (float numero) {
	    	  if (numero==0)
	    	    return 1;
	    	  else
	    	    return numero * nFact(numero-1);
	    	}
	    public static float log (float base,float num) {
	    	
			return (float) (Math.log10(num)/Math.log10(base));
			
	    	
	    }
	 
}
