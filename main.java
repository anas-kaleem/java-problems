import java.util.Scanner;
import java.util.Arrays;

class StringArray{
  private String textArray[];
  private int size;
  public void populateArray(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    size = scanner.nextInt();
    
    textArray = new String[size];
    for(int i = 0; i < textArray.length; i++){
      textArray[i] = Integer.toString(i);
}

    System.out.print("\nString Array: " + Arrays.toString(textArray));
}
}

public class main{
  public static void main(String args[]){
    StringArray stringArray = new StringArray();
    stringArray.populateArray();
}
}