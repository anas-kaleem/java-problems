import java.util.Scanner;
import java.util.Arrays;
class ArrayPair{
  private int array1[] = new int[5];
  private int array2[] = new int[5];
  
  private int count = 0;
  private int indexes[] = new int[5];
  public void checkArrays(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < array1.length; i++){
      System.out.printf("\nEnter %dth number of Array1: ",i+1);
      array1[i] = scanner.nextInt();
      System.out.printf("Enter %dthe number of Array2: ",i+1);
      array2[i] = scanner.nextInt();
}
    int temp = 0;
    for(int i = 0; i < array1.length; i++){
      if(array1[i] - array2[i] <= 1){
	count = count + 1;
	indexes[temp] = 1;
	temp = temp + 1;
}
      else{
	indexes[temp] = 0;
	temp = temp + 1;
}
}

System.out.printf("\nTotal of: %d numbers have difference of 1 or less than 1, they are present at: ",count);
System.out.print(Arrays.toString(indexes));
}
}

public class main{
  public static void main(String args[]){
    ArrayPair arrayPair = new ArrayPair();
    arrayPair.checkArrays();
}
}