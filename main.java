import java.util.Scanner;

class Numbers{
  private int numbers[] = new int[7];
  private boolean isTrue = false;
  public void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter number for index# %d: ",i);
      numbers[i] = scanner.nextInt();
}//frist-for

    for(int i = 1; i < numbers.length - 1; i++){
      if(isTrue == true){
	
	break;
}//first-if-in-second-for

      else if(isTrue == false && (numbers[i] == 10 || numbers[i] == 20)){
	if(numbers[i-1] == 10 && numbers[i + 1] == 10){isTrue = true;System.out.printf("\nNumber on left side of %d is: %d and on right it is: %d", numbers[i], numbers[i-1], numbers[i+1]);}
	else if(numbers[i - 1] == 20 && numbers[i + 1] == 20){isTrue = true; System.out.printf("\nNumber on left side of %d is: %d and on right is : %d", numbers[i], numbers[i - 1], numbers[i + 1]);}
}//first-elseif-of-first-if-in-second-for
}//second-for
}
}

public class main{
  public static void main(String args[]){
    Numbers number = new Numbers();
    number.checkNumbers();
}
}