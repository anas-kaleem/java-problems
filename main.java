import java.util.Scanner;
import java.util.Arrays;

class LargestValue{
  private int numbers[] = new int[3];
  public int getLargestNumber(int number1, int number2){
    if(number1 < number2){return number2;}
    else{return number1;}
}//getLargestNumber()

  public void printLargestNumber(){
    int largestNumber;
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter number# %d: ", i);
      numbers[i] = scanner.nextInt();
}//first-for-in-printLargestNumber()
    
    largestNumber = getLargestNumber(numbers[0], numbers[numbers.length - 1]);
    System.out.print("\nOriginal Array: " + Arrays.toString(numbers));
    System.out.printf("\nLargest value between first and last element: %d", largestNumber);
}//printLargestNumber()

}//class-LargestValue{}

public class main{
  public static void main(String args[]){
    LargestValue largestValue = new LargestValue();
    largestValue.printLargestNumber();
}
}