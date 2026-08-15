import java.util.Scanner;

class Conjecture{

  private int n;
  public void computeNumber(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter a number: ");
    n = scanner.nextInt();
    while(n > 1){
      if(n % 2 == 0){ n = n/2; System.out.printf("\nnumber# is: %d", n);}
      else if(n % 2 != 0){ n = n*3+1; System.out.printf("\nnumber# is: %d", n);}     
}
}
}

public class main{
  public static void main(String args[]){
    Conjecture conjecture = new Conjecture();
    conjecture.computeNumber();
}
}