public class Practice{

  public static int MaxNum(int[] arr){
    int max=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[] arr={3,4,2,5,6};
  
   
   System.out.println(MaxNum(arr));
   }
  
}