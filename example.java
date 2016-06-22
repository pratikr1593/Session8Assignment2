import java.util.*;
public class example {

	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		  HashSet hs = new HashSet();
	      // add elements to the hash set
	      hs.add("Fly");
	      hs.add("20");
	      hs.add("20");
	      hs.add("5.65");
	      hs.add("Winner");
	      hs.add("FLoat");
	      
	      
	      Iterator it = hs.iterator();
	      System.out.println("\n Hashset elements are: \n");
	      while(it.hasNext())
	      {
	    	  
	    	  System.out.println(" "+it.next());
	      }
	      

	}

}