import java.util.ArrayList;
public class ListPract {

	public static void main(String[] args) 		
		{ 
	        ArrayList<Integer> al = new ArrayList<>(); 
	        
	        ArrayList<Integer> reverse = new ArrayList<>();
	        
	        al.add(10); 
	        al.add(20); 
	        al.add(30); 
	        al.add(1); 
	        al.add(2); 
	  
	        //First element index is 0
	        int first = 0 ;
	        
	        // Last element's index is always size -1
	       // int index = (al.size()-1); 
	  
	        // Delete first element by passing index 
	      //  al.remove(index); 
	      //  al.remove(0);
	         
	        al.remove(new Integer(30));  //this is a way to remove a specific number using objects
	  
	        System.out.println("Modified ArrayList : " + al); 
	        System.out.println(al);
	        
	        System.out.println(al.contains(10));  //check if it contains a specified value
	        
	        System.out.println(al.indexOf(10));  //gets index of specific element
	        
	      //copy array list function
	       ArrayList bl =  (ArrayList )al.clone();
	       System.out.println(bl);
	        
	        //reverse array   
	        for(int i = al.size()-1; i>-1; i --)
			{
				reverse.add (al.get(i) );	
			}  
	        System.out.print(reverse);
	        
	        for(Integer element: al){ //advanced for loop
	            //print each element from ArrayList
	            System.out.println(element);
	        }   
	        
	        //make 30 the top of the stack 
	        System.out.println(al);
	        int temp = al.get(1);
	        al.remove(1);
	        al.add(temp);
	        System.out.println(al);
	        
	    } 

}
