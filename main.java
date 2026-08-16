import java.util.Scanner;
import java.util.Arrays;

class Numbers{
  private int numbers[] = new int[7];
  public void sortNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter the number for index# %d: ",i);
      numbers[i] = scanner.nextInt();
}//first-for-in-sortNumbers();
    int temp;
    for(int i = 0; i < numbers.length; i++){
      if((numbers[i] % 2 == 0) && (i < numbers.length - 1)){
  	for(int j = i + 1; j < numbers.length; j++){
  	  if(numbers[j] % 2 != 0){
 	    temp = numbers[i]; numbers[i] = numbers[j]; numbers[j] = temp;
	    break;
}//if
}//for
}//if`
}//second-for

    System.out.println("Sorted Array: " + Arrays.toString(numbers));
}//void-sortNumbers();
}//class-Numbers{}

public class main{
  public static void main(){
    Numbers number = new Numbers();
    number.sortNumbers();
}
}