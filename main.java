import java.util.Scanner;
import java.util.Arrays;

class Single{
  private int numbers[];
  private int size;
  private String singles = "";
  public int[] getArray(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the size of Array: ");
    size = scanner.nextInt();
    numbers = new int[size];
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter %dth value: ", i + 1);
      numbers[i] = scanner.nextInt();
}
    return numbers;
}

  public void checkArray(){
    int array[] = getArray();
    int arrayCopy[] = Arrays.copyOf(array, array.length);
    int temp;
    boolean isTrue = false;
    int mover = 0;
    for(int i = 0; i < arrayCopy.length; i++){
      temp = arrayCopy[0];
      isTrue = false;
      arrayCopy[0] = arrayCopy[i];
      arrayCopy[i] = temp;
      mover = 1;
      while(mover < arrayCopy.length){
	if(arrayCopy[0] == arrayCopy[mover]){
	  isTrue = true;
}
      	mover = mover + 1;
}
      if(isTrue == false){singles = singles + " " + arrayCopy[0];}
}
    System.out.printf("\nThe singles are: %s", singles);
}
}

public class main{
  public static void main(String args[]){
    Single single = new Single();
    single.checkArray();
}
}