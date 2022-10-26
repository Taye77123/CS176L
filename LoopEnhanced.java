import java.util.* ;
public class LoopEnhanced
{
	  public static void main ( Double[] args)
	  {
	    ArrayList<Double> numb = new ArrayList<Double>();

	    numb.add(25.3);   
	    numb.add((double) 100); 
	    numb.add((double) -10); 
	    numb.add(-1.5); 
	    numb.add((double) 13);
	    numb.add(98.6);
	    numb.add((double) 17);  
	    numb.add(123.145);
	    numb.add(125.6);
	    numb.add(123.146);

	    for ( Double nm : numb ) 
	      System.out.println( nm );
	  }
	}