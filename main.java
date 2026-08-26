import java.util.Scanner;

class NumberPairs{
  private int numbers[] = new int[7];
  private int inputNum;
  private boolean isTrue = false;
  private int indexes[] = new int[4];
  public void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter %dth number: ", i + 1);
      numbers[i] = scanner.nextInt();
}//1st-forLoop-in-NumberPairs()
    System.out.print("\nEnter the number you wanna find: ");
    inputNum = scanner.nextInt();
    for(int i = 0; i < numbers.length; i = i + 2){
      if(i + 1 >= numbers.length){
	if(inputNum == numbers[i]){
	  isTrue = true;continue;
}//1st-if-in-1st-if-of-2nd-forLoop-in-checkNumbers()
  	else{isTrue = false; continue;}
}//1st-if-in-2nd-forLoop-in-checkNumbers()
     else if(inputNum == numbers[i] || inputNum == numbers[i+1]){isTrue = true;}
     else{isTrue = false;}
}//2nd-forLoop-in-NumberPairs()

  if(isTrue == true){System.out.print("\nYes! the number is present in every pair of numbers.");}
  else if(isTrue == false){System.out.print("\nNo! there is not the desired number in every pair of array.");}
}//void-checkNumbers()
}//class-NumberPairs{}

public class main{
  public static void main(String args[]){
    NumberPairs numberPair = new NumberPairs();
    numberPair.checkNumbers();
}
}