import java.util.Scanner;

class Twenties{
  private int numbers[] = new int[7];
  private int count = 0;
  private boolean isTrue = true;
  private int indexes[] = new int[3];
  public void checkTwenties(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter %dth number: ", i+1);
      numbers[i] = scanner.nextInt(); 
}//1st-forLoop-in-checkTwenties()

int temp = 0;
    for(int i = 0; i < numbers.length - 1; i++){
      if(count == 3){
 	System.out.printf("\n3 consecutive twenties found at %d, %d, %d", indexes[0], indexes[1], indexes[2]);break;
}//1st-if-in-2nd-forLoop-in-checkTwenties()
      else if(isTrue == false){System.out.print("\nWarning! Twenties are next to each other.");break;
}//1st-elseIf-in-2nd-forLoop-in-checkTwenties()
      else if(numbers[i] == 20 && numbers[i+1] != 20){
	count = count + 1;
        indexes[temp] = i;
	temp = temp + 1;
}//2nd-elseIf-in-2nd-forLoop-in-checkTwenties()

      else if(numbers[i] == 20 && numbers[i+1] == 20){isTrue = false;}
}//2nd-forLoop-in-checkTwenties()


  if(count < 3 && isTrue == true){
    System.out.print("\nThere are less than 3 Twenties in the array.");
}
    
}//void-checkTwenties()
}//class-Twenties{}


public class main{
  public static void main(String args[]){
    Twenties twenties = new Twenties();
    twenties.checkTwenties();
}
}