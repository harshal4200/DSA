import java.util.Scanner;

// Complexity O(n);

public class LargestElement{

  public static int findLargestElement(int[] arr){

    int max=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max)
        max=arr[i];
      
    }
    return max;

  }

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Element: ");
    int size=sc.nextInt();

    int[] arr=new int[size];
    System.out.println("Enter the array values: ");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }

    int maxValue=findLargestElement(arr);
    System.out.println("The largest element in the array is: "+maxValue);
  }
}