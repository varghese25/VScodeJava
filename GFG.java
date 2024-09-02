// Java code to illustrate remove duolicate 
// of ArrayList using hashSet<> method 

import java.util.*; 

public class GFG { 
	public static void main(String args[]) 
	{ 

		// create a ArrayList String type 
		ArrayList<String> 
			gfg = new ArrayList<String>(); 

		// Initialize an ArrayList 
		gfg.add("Geeks"); 
		gfg.add("for"); 
		gfg.add("Geeks"); 

		// print ArrayList 
		System.out.println("Original ArrayList : "
						+ gfg); 

		// -----Using LinkedHashSet----- 
		System.out.println("\nUsing LinkedHashSet:\n"); 

		// create a set and copy all value of list 
		Set<String> set = new LinkedHashSet<>(gfg); 

		// create a list and copy all value of set 
		List<String> gfg1 = new ArrayList<>(set); 

		// print ArrayList 
		System.out.println("Modified ArrayList : "
						+ gfg1); 

		// -----Using HashSet----- 
		System.out.println("\nUsing HashSet:\n"); 

		// create a set and copy all value of list 
		@SuppressWarnings("unused")
        Set<String> set1 = new HashSet<>(gfg); 

		// create a list and copy all value of set 
		List<String> gfg2 = new ArrayList<>(set); 

		// print ArrayList 
		System.out.println("Modified ArrayList : "
						+ gfg2); 
	} 
} 

/* Out Put
Original ArrayList : [Geeks, for, Geeks]
Using LinkedHashSet:
Modified ArrayList : [Geeks, for]
Using HashSet:
Modified ArrayList : [Geeks, for]*/