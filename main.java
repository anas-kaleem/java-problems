import java.util.Scanner;

class Addition{
  private int inputNum;
  private int result = 0;
  private int temp;
  public void addNumbers(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    inputNum = scanner.nextInt();
    while(inputNum > 0){
      temp = inputNum % 10;
      if((result + temp) < 10){
	result = result + temp;
	inputNum = inputNum / 10;
}
      else{break;}
}

    System.out.printf("Result is: %d", result);
}
}

public class main{
  public static void main(String args[]){
    Addition addition = new Addition();
    addition.addNumbers();
}
}