import java.util.Scanner;

class Twenty{
  private int numbers[] = new int[8];
  private boolean isUnique[] = {false, false, false};
  
  public void checkTwenty(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter the number for index# %d",i+1);
      numbers[i] = scanner.nextInt();
}
    int index = 0;
    for(int i = 0; i < numbers.length - 1; i++){
      if((numbers[i] == 20) && (numbers[i+1] != 20)){
	isUnique[index] = true;
	index = index + 1;
}
}

    if((isUnique[0] == true) && (isUnique[1] == true) && (isUnique[2] == true)){
      System.out.print("\nYes! there are 3X twenties in your given array");
}
    else{System.out.print("\nNo! the twenties in your given array are either less than 3 or they are consecutive.");}
}
}

public class main{
  public static void main(String args[]){
    Twenty twenty = new Twenty();
    twenty.checkTwenty();
}
}