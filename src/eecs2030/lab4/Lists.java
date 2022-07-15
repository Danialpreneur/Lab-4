package eecs2030.lab4;

import java.util.Comparator;
import java.util.List;

public class Lists {
	private Lists(){} //no objects of this class are desired
	
	
	
	public static <T extends Comparable <? super T>> void defaultSort(List <T> list){
		list.sort(Comparator.naturalOrder()); //will use a built-in variation of mergesort
											//alternative: Collections.sort(list);
	}
	
	  public static void swap(int[] list, int i, int j)
	    {
	        int temp = list[i];
	        list[i] = list[j];
	        list[j] = temp;
	    }

	
		
		
		public static <T extends Comparable <? super T>> void selectionSortRecursive(List <T> list){
			//TODO implement the recursive solution
			
			if(list.size()<2) {
				return;
			}
			Lists.selectionSortIterative(list.subList(0, list.size()));
			T first = list.get(0);
			T second = list.get(1);
			if (second.compareTo(first) < 0) {
				list.set(0, second);
				list.set(1, first);
			}
			
		}
	public static <T extends Comparable <? super T>> void selectionSortIterative(List <T> list){
	//TODO implement the Iterative solution
		if(list.size()>= 2) {

 			for(int i = 0; i < list.size();i++) {
 				int startingLowIndex = i;
 				int lowestValueIndex = i;
			
 				for(int j = i; j < list.size(); j++) {
 					if((int)list.get(j) < (int) list.get(lowestValueIndex)) {
 						lowestValueIndex = j;
 					}
 				}
			
				if(lowestValueIndex != startingLowIndex) {
					
					T a =  list.get(startingLowIndex);
					T b =  list.get(lowestValueIndex);
					
					T swap = a;
					a = b;
					b = swap;
					
					list.set(startingLowIndex, a);
					list.set(lowestValueIndex, swap);
				}
			
		
		}
	}
}

}