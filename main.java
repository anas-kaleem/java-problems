import java.util.Scanner;

class Numbers{
  private int array1[] = new int[7];
  public void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < array1.length; i++){
      System.out.printf("\nEnter %dth number: ", i + 1);
      array1[i] = scanner.nextInt();
  
}
    if(array1[0] == array1[array1.length - 2] && array1[1] == array1[array1.length - 1]){
      System.out.print("Yes! the groups are same.");
}
    else{
      System.out.print("No! the groups are not same.");
}
}
}

public class main{
  public static void main(String args[]){
    Numbers number = new Numbers();
    number.checkNumbers();
}
}