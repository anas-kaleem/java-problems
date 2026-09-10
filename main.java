import java.util.Scanner;

class Median{
  private int numbers[] = {10,2,38,23,38,23,21};
  private int pointer;
  private int temp;
  private int result;
  public void sortArray(){
    for(int i = 0; i < numbers.length - 1; i++){
      pointer = i + 1;
      while(pointer < numbers.length){
	if(numbers[pointer] < numbers[i]){
	  temp = numbers[i];
	  numbers[i] = numbers[pointer];
	  numbers[pointer] = temp;
}
 	pointer = pointer + 1;
}
}
}
  public void computeMedian(){
    sortArray();
    int index = numbers.length / 2;;
    if(numbers.length % 2 != 0){
      
      result = numbers[index + 1];
}
    else if(numbers.length % 2 == 0){
      result = (numbers[index] + numbers[index + 2]) / 2;
}

    System.out.printf("\nThe median is: %d",result);
}
}

public class main{
  public static void main(String args[]){
    Median median = new Median(); 
    median.computeMedian();
}
}