import java.util.Scanner;

class Zeroes{
  private long inputNum;
  private long factorial = 1;
  private long countZeroes = 0;
  public void computeNumbers(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    inputNum = scanner.nextInt();
    for(int i = 1; i <= inputNum; i++){
      factorial = (factorial * i);
}
    System.out.printf("\nFactorial: %d", factorial);
    while(factorial > 0){
      if((factorial % 10) != 0){
	break;
}
      else if((factorial % 10) == 0){countZeroes = countZeroes + 1; factorial = factorial / 10;}
}
    System.out.printf("\nThe number of zeroes are: %d",countZeroes);
}
}

public class main{
  public static void main(String args[]){
    Zeroes zero = new Zeroes();
    zero.computeNumbers();
}
}