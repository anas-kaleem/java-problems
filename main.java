import java.util.Scanner;
import java.util.Arrays;

class Elements{
  private int numbers[];
  private int resultArray[];
  private int size;
  private int index;
  private int target;
  private int tempArray[];
  public void removeElements(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter size of array: ");
    size = scanner.nextInt();
    numbers = new int[size];
    for(int i = 0; i < size; i++){
      System.out.printf("\nEnter %dth number: ", i + 1);
      numbers[i] = scanner.nextInt();
}
    tempArray = new int[size];
    tempArray = Arrays.copyOf(numbers,size);
    System.out.print("\nEnter the number you want to remove: ");
    target = scanner.nextInt();
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == target){
	size = size - 1;
	resultArray = new int[size];
	int temp = 0;
  	for(int j = 0; j < numbers.length; j++){
	  if(j != i){
	    resultArray[temp] = numbers[j];
	    temp = temp + 1;
}
}
  	numbers = new int[size];
	numbers = Arrays.copyOf(resultArray,size);
}
}

    System.out.print("\nOriginal Array: " + Arrays.toString(tempArray));
    System.out.print("\nResultant Array: " + Arrays.toString(resultArray));
}
}

public class main{
  public static void main(String args[]){
    Elements element = new Elements();
    element.removeElements();
}
}