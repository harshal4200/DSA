

public class One{
  public static void main(String[] args){
    int[] arr={2,4,6,7,8,0};
    for(int val:arr){
      System.out.print(val+" ");
    }
    arr[1]=9;
    System.out.println(arr.length);
    for(int val: arr){
      System.out.print(val+" ");
    }
  }
}