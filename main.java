import java.util.Scanner;

class Power{
  private double inputNum;
  public void checkNumber(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    inputNum = scanner.nextDouble();
    while(inputNum > 1){
      if((inputNum / 4) == 1){
	inputNum = inputNum/4;
  	System.out.print("Yes! the number is a power of 4.");
	break;
}
      else{inputNum = inputNum / 4;}
}

    if(inputNum != 1){
      System.out.print("\nNo! the number is not divided by 4.");
}
}
}

public class main{
  public static void main(String args[]){
    Power power = new Power();
    power.checkNumber();
}
}