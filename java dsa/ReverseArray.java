import java.util.Scanner;

// Complexity O(n);

public class ReverseArray{

  public static void findReverseArray(int[] arr){
    
    for(int i=0;i<arr.length/2;i++){
      int temp=arr[i];
      arr[i]=arr[arr.length-i-1];
      arr[arr.length-i-1]=temp;
    }
  }


  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the size: ");
    int size=sc.nextInt();
    int[] arr=new int[size];
    
    System.out.println("Enter the element: ");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    findReverseArray(arr);
    for(int val:arr){
      System.out.print(val+" ");
    }
  }
}