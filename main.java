import java.util.Scanner;
import java.util.Arrays;

class MyArrays{
  private int array1[] = new int[7];
  private int index;
  private int size = 0;
  private int array2[];
  public void fillArray(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < array1.length; i++){
      System.out.printf("\nEnter the %dth number: ", i + 1);
      array1[i] = scanner.nextInt();
      if(array1[i] == 10){index = i;}
}

    array2 = new int[index];
    for(int i = 0; i < array2.length; i++){
      array2[i] = array1[i];
}

    System.out.print("The resultant array is: " + Arrays.toString(array2));
}
}

public class main{
  public static void main(String args[]){
    MyArrays myArray = new MyArrays();
    myArray.fillArray();
}
}