public class SortedOrNot{

  public static boolean Sortedornot(int arr[]){
    boolean isSorted=true;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i+1]<arr[i])
        isSorted=false;
      
    }
    return isSorted;
  }
  public static void main(String args[]){
    int[] arr={1,2,3,4,55,66};

    boolean sort=Sortedornot(arr);
    System.out.println("Does Array is sorted: "+sort);
  }
}