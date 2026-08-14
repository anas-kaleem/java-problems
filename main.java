import java.util.Scanner;

class Ten{
  private int numbers[] = new int[7];
  public void checkTen(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.print("\nEnter the number: ");
      numbers[i] = scanner.nextInt();
}//first-for-loop

    if(numbers[0] == 10){System.out.printf("\nfirst number is %d", numbers[0]);}
    else{System.out.print("\nfirst number is not 10");}
    if(numbers[numbers.length - 1] == 10){System.out.printf("\nlast number is %d", numbers[numbers.length - 1]);}
    else{System.out.print("\nlast number is not 10");}
}//void-checkTen()
}//class-Ten{}

public class main{
  public static void main(String args[]){
    Ten ten = new Ten();
    ten.checkTen();
}
}