public class ZerotoEnd{
  public static int MoveToEnd(int[] arr){
    int index=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[index]=arr[i];
        index++;
      }

      
    }
    while(index<arr.length){
      arr[index]=0;
      index++;
    }
        return index;
  }
  public static void main(String args[]){
    int[] arr={3,44,0,22,0,33,76};
    MoveToEnd(arr);
    for(int val:arr){
      System.out.print(val+" ");
    }
    System.out.println();
  }
}