import java.util.Scanner;
import java.util.Arrays;
class MyArrays{
  private int numbers[] = new int[7];
  public void shiftArray(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter %dth number: ", i + 1);
      numbers[i] = scanner.nextInt();
}

    for(int i = 0; i < numbers.length - 1; i++){  
   	numbers[i] = numbers[i + 1];
      
}

    System.out.print("The resultant array: " + Arrays.toString(numbers));
}
}

public class main{
  public static void main(String args[]){
    MyArrays myArray = new MyArrays();
    myArray.shiftArray();
}
}