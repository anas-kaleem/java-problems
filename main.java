import java.util.Scanner;

class Subtraction{
  private int number1;
  private int number2;
  private int number3;
  private int result;
  private boolean isTrue;
  public void subtract(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    number1 = scanner.nextInt();
    System.out.print("Enter 2nd number: ");
    number2 = scanner.nextInt();
    System.out.print("Enter 3rd number: ");
    number3 = scanner.nextInt();
    
    result = number1 - number2;
    if(number3 <= result - 20){
      isTrue = true;
}
    else{isTrue = false;}

    System.out.print(isTrue);
}
}

public class main{
  public static void main(String args[]){
    Subtraction subtraction = new Subtraction();
    subtraction.subtract();
}
}