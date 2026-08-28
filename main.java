import java.util.Scanner;

class MyArrays{
  private int numbers[] = new int[7];
  private boolean isTrue = false;
  private int count = 0;
  public void checkArray(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter %dth number: ", i + 1);
      numbers[i] = scanner.nextInt();
}
    for(int i = 1; i < numbers.length; i++){
      if(count == 2){
	isTrue = true;break;
}
      else if(numbers[i] > numbers[i - 1]){
  	count = count + 1;
}

      else{count = 0;}
}

    if(isTrue == true){
      System.out.print("\nYes! three consecutive numbers are in ascending order in array.");
}
    else{
      System.out.print("\nNo! three consecutive numbers are not in descending order.");
}
}
}

public class main{
  public static void main(String args[]){
    MyArrays myArray = new MyArrays();
    myArray.checkArray();
}
}