
//the method in this class can be used by any comparable objects
public class SortingMethods {
   
  //quick sort
   public static int partition(Comparable[] list, int p, int r){
      Comparable x = list[p]; // pivot
      int i = p - 1;
      int j = r + 1;
      
      while(true){
         do{
            j--;
         }while(list[j].compareTo(x) > 0);
         do{
            i++;
         }while(list[i].compareTo(x) < 0);
         
         if(i < j){
            Comparable temp = list[i];
            list[i] = list[j];
            list[j] = temp;
         }
         else{
            return j;
         }
      }
   }
   
   public static void quickSort(Comparable[] list, int p, int r){
      if(p < r){
         int q = partition(list, p, r);
         quickSort(list, p ,q);
         quickSort(list, q+1, r);
      }
   }
  
  
  
  
	  
	  	 
}//end class

