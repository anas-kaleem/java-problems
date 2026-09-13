import java.util.Scanner;
import java.util.Arrays;

class NthElement{
  private int numbers[];
  private int index;
  private int size;
  private int resultList[];
  public void removeElement(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the size of the list: ");
    size = scanner.nextInt();
    numbers = new int[size];
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter %dth number: ",i + 1);
      numbers[i] = scanner.nextInt();
}
    System.out.print("\nEnter the nth element to remove: ");
    index = (scanner.nextInt() - 1);
    resultList = new int[size - 1];
    int temp = 0;
    for(int i = 0; i < numbers.length; i++){
      if(i != index){
        resultList[temp] = numbers[i];
	temp = temp + 1;
}
}
    System.out.print("\nOriginal Array: " + Arrays.toString(numbers));
    System.out.print("\nResultant Array: " + Arrays.toString(resultList));
}
}

public class main{
  public static void main(String args[]){
    NthElement nthElement = new NthElement();
    nthElement.removeElement();
}
}