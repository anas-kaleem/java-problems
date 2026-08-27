import java.util.Scanner;
import java.util.Arrays;

class MyArrays{
  private int array1[] = new int[7];
  private int array2[];
  private int index;
  private int size = 0;
  public void fillArray(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < array1.length; i++){
      System.out.printf("\nEnter %dth number: ", i + 1);
      array1[i] = scanner.nextInt();
}

    for(int i = array1.length - 1; i >= 0; i--){
      size = size + 1;
      if(array1[i] == 10){
	index = i;break;
	
}
      
}
    
    array2 = new int[size - 1];
    int temp = 0;
    for(int i = index + 1; i < array1.length;i++){
      array2[temp] = array1[i];
      temp = temp + 1;
}

    System.out.print("The resultant array: " + Arrays.toString(array2));
}
}

public class main{
  public static void main(String args[]){
    MyArrays myArray = new MyArrays();
    myArray.fillArray();
}
}