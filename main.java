import java.util.Scanner;

class Comparison{
  private int number1;
  private int number2;
  public void printResult(){
    System.out.print(compareNumbers());
}
  public int compareNumbers(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    number1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    number2 = scanner.nextInt();
    if(number1 == number2){return 0;}

    else if((number1 % 6) == (number2 % 6)){
      if(number1 < number2){return number1;}
      else{return number2;}
}

    else{
      if(number1 < number2){return number2;}
      else{return number1;}
}
}
}

public class main{
  public static void main(String args[]){
    Comparison comparison = new Comparison();
    comparison.printResult();
}
}
