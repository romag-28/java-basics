package Ärray;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				 
			        
		      List<Integer> list=new ArrayList<Integer>();
		      list.add(2);
		      list.add(5);
		      list.add(7);
		      System.out.println("Before reverse" + list);
		     
		      
		      ListIterator iterator=list.listIterator(list.size());
		       
		      while(iterator.hasPrevious())
		      {
		        System.out.println(iterator.previous());
		      }
		         
		    }
		

	}


