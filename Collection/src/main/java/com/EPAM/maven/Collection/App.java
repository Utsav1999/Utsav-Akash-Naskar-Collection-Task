package com.EPAM.maven.Collection;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	 CustomList<Integer> list = new CustomList<Integer>();
    	 Scanner sc = new Scanner(System.in);
    	
    	 while(true)
    	 {
    		 System.out.println("Press 1 to ADD\nPress 2 to FETCH\nPress 3 to REMOVE\nPress 4 to PRINT\nPress 5 to EXIT");
    		 System.out.print("Enter your choice: ");
    		 int ch = sc.nextInt();
    		 switch(ch)
    		 {
    		 	case 1: System.out.print("Enter element to add: ");
    		 			int ele = sc.nextInt();
    		 			list.add(ele);
    		 			System.out.print("Element Added\n");
    		 			break;
    		 			
    		 	case 2: System.out.print("Enter index to fetch element: ");
    		 			int index = sc.nextInt();
    		 			System.out.println("Fetched element is: " + list.get(index));
    		 			break;
    		 			
    		 	case 3: System.out.print("Enter element's index to remove: ");
	 					int indx= sc.nextInt();
	 					list.remove(indx);
	 					System.out.print("Element Removed\n");
	 					break;
	 					
    		 	case 4: System.out.println(list);
    		 			break;
    		 			
    		 	case 5: System.exit(0);
    		 	
    		 	default: System.out.println("Wrong Choice!");
    		 }
    	 }
    }
}
