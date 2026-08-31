import java.util.Scanner;

class Stairs{
  private int inputNum;
  public void printStairs(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    inputNum = scanner.nextInt();
    int temp = inputNum;
    for(int i = 1; i <= inputNum; i++){
      for(int j = 1; j <= i; j++){
	if(temp == 0){break;}
	else{
	  System.out.print("$");
	  temp = temp - 1;
}
}
	System.out.print("\n");
}
}
}

public class main{
  public static void main(String args[]){
    Stairs stair = new Stairs();
    stair.printStairs();
}
}