
public class SearchingMethods {

   public static int binarySearch(Comparable[] list, int left, int right, Comparable key){
      //variables
      int foundIndex = -1;
      int middle = (left + right)/2;
      
      //search
      if(list[middle].compareTo(key) == 0) {
         foundIndex = middle;
      }
      else if(key.compareTo(list[middle]) < 0){
         if(left <= middle -1){
            foundIndex = binarySearch(list, left, middle-1, key);
         }
      }
      else{
         if(right >= middle +1){
            foundIndex = binarySearch(list, middle+1, right, key);
         }
      }
      return foundIndex;
   }
	 
}//end class

