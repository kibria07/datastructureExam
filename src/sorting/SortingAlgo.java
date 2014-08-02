package sorting;

public class SortingAlgo {

		
		//Selection Sort
		//public int[] selectionSort(int [] list){ selectionSort(int Array);{
		
		
		int [] array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};


		

			//return list;
		//}
		
		//Insertion Sort
		public int [] insertionSort (int [] array){
			
			for (int i = 1; i < array.length; i++) {
	            int valueToSort = array[i];
	            int j = i;
	            while (j > 0 && array[j - 1] > valueToSort) {
	                array[j] = array[j - 1];
	                j--;
	            }
	            array[j] = valueToSort;
	        }
		    
		    
		   
			
			return  array;
}
		
		
		//Bubble Sort
		public int[] bubbleSort(int [] array){

			
			 int n = array.length;
             int temp = 0;
            
             for(int i=0; i < n; i++){
                     for(int j=1; j < (n-i); j++){
                            
                             if(array[j-1] >array[j]){
                                     //swap the elements!
                                     temp = array[j-1];
                                    array[j-1] = array[j];
                                     array[j] = temp;
                             }
                            
                     }
             }
     
			
			return array;
		}
		
		//Merge Sort
		public int[] mergeSort(int [] array){
			 
			return array;
		}
		
}
