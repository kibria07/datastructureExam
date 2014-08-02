package sorting;

public class ApplySorting {

	public static void main(String[] args) {
		/*
		 * Use the available sorting methods in SortingALgo() class to sort the below array of numbers.
		 */
		int [] array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};

	   
	  
	    
	    SortingAlgo sa = new SortingAlgo();
	    sa.insertionSort(array);
	    
	  System.out.println("This is an insertion sort");
        for(int i=0; i < array.length; i++){
                System.out.print(array[i] + " ");
        }
       
        //sort an array using bubble sort algorithm
        sa.bubbleSort(array);
       
        System.out.println("");
       
        //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < array.length; i++){
                System.out.print(array[i] + " ");
        }

	    

	  }
		
		
		

	}


