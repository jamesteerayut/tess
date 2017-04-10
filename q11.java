package q1;
import java.util.*;
public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("J");
		   listofcountries.add("A");
		   listofcountries.add("M");
		   listofcountries.add("E");
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   Collections.sort(listofcountries);
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   System.out.println(listofcountries);
	}

}
