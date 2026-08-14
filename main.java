import java.util.Scanner;

class MyArrays{
  private int numbers[] = new int[2];
  public void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter number# %d: ", i);
      numbers[i] = scanner.nextInt();
      
}

    if(numbers[0] == 4 || numbers[0] == 7){System.out.printf("\nnumber# %d exists in array", numbers[0]);}
    else if(numbers[1] == 4 || numbers[1] == 7){System.out.printf("\nnumber# %d exists in array", numbers[1]);}
    else{System.out.print("none of 4 or 7 exists in array");}
}
}

public class main{
  public static void main(String args[]){
    MyArrays arrays = new MyArrays();
    arrays.checkNumbers();
}
}