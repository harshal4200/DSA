
// Complexity(O(n))


public class CountNum {

  public static int CountNum(int[] arr,int num){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==num){
        count++;
      }
    }
    return count;
  }

  public static void main(String args[]){
    int[] arr={33,55,23,55,22,56,65,66,32,33,99};
    int target=55;
    int count=CountNum(arr,target);
    System.out.println(count);
  }
  
}
