import java.util.Scanner;
import java.util.Arrays;

class Swapper{
  private int numbers[] = new int[3];

  public int[] swapNumber(int[] numbers){
     int temporary = numbers[0];
     numbers[0] = numbers[numbers.length - 1];
     numbers[numbers.length - 1] = temporary;
     return numbers;
     
}//swapNumber
  public void swapArray(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter number# %d: ", i);
      numbers[i] = scanner.nextInt();
}//for
  
  System.out.print("\nOriginal Array: " + Arrays.toString(numbers));
  System.out.print("\nNew Array after swapping: " + Arrays.toString(swapNumber(numbers)));  
	    
}
}

public class main{
  public static void main(String args[]){
    Swapper swapper = new Swapper();
    swapper.swapArray();
}
}