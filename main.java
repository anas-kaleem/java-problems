import java.util.Scanner;
import java.util.Arrays;

class MyArrays{
  private int arr1[] = new int[3];
  private int arr2[] = new int[3];
  private int result[] = new int[2];
  public void printArrays(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < 3; i++){
      System.out.printf("\nEnter number# %d for array1: ",i);
      arr1[i] = scanner.nextInt();
      System.out.printf("Enter number# %d for array2: ",i);
      arr2[i] = scanner.nextInt();
}
    
    result[0] = arr1[0];
    result[1] = arr2[arr2.length - 1];
    System.out.printf("\nArray1: %s", Arrays.toString(arr1));
    System.out.printf("\nArray2: %s", Arrays.toString(arr2));
    
    System.out.printf("\nResult: %s", Arrays.toString(result));
}
}

public class main{
  public static void main(String args[]){
    MyArrays arr = new MyArrays();
    arr.printArrays();
}
}