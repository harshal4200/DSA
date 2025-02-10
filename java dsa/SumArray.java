import java.util.Scanner;
public class SumArray{

  public static int ArraySum(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size=sc.nextInt();
    System.out.println();
    System.out.print("Enter the element: ");
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    int sum=ArraySum(arr);
    System.out.println("The sum of the array is: "+sum);
  }
}