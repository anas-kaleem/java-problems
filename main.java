import java.util.Scanner;

class SquareRoot{
  private int inputNum;
  private int result;
  public void computeRoot(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter a number: ");
    inputNum = scanner.nextInt();
    for(int i = 0; i < inputNum; i++){
      if(inputNum == 0 || inputNum == 1){
	result = inputNum;
 	break;
}

      else if((i * i) == inputNum){
	result = i;
	break;
}
      else if((i * i) < inputNum){
	result = i;
}
      else if((i * i) > inputNum){break;}
}

    System.out.printf("\nSquare root of %d is: %d", inputNum, result);
}
}

public class main{
  public static void main(String args[]){
    SquareRoot squareRoot = new SquareRoot();
    squareRoot.computeRoot();
}
}