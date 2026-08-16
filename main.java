import java.util.Scanner;

class Numbers{
  private int inputNum;
  private int numbers[] = new int[7];
  public void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter the nmber on index# %d: ", i+1);
      numbers[i] = scanner.nextInt();

}

    System.out.print("\nEnter the number you want to find: ");
    inputNum = scanner.nextInt();

    for(int i = 0; i < numbers.length; i++){
      if((i < numbers.length - 1) && (numbers[i] == inputNum) && (numbers[i + 1] == inputNum)){
	System.out.printf("\nNumbers matched. Number you gave: %d, is same as the number at %d: %d & %d: %d", inputNum, i, numbers[i], i + 1, numbers[i+1]); break;		
	
}

      else if((i < numbers.length - 2) && (numbers[i] == inputNum) && (numbers[i + 2] == inputNum)){
      	System.out.printf("\nNumbers matched. Number you gave: %d is same as in array at %d: %d & %d: %d",inputNum, i, numbers[i], i + 2, numbers[i+2]); break;
}

      else{
      	if(i == numbers.length - 1){System.out.print("Nothing matched.");}
}
}
}
}

public class main{
  public static void main(String args[]){
    Numbers number = new Numbers();
    number.checkNumbers();
}
}