import java.util.Scanner;

class Numbers{
  private int array[] = new int[7];
  private boolean isTen = false;
  private boolean isThirty = false;
  public void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < array.length; i++){
      System.out.printf("\nEnter %dth element: ", i+1);
      array[i] = scanner.nextInt();
}

    for(int i = 0; i < array.length; i++){
      if(isTen == true && isThirty == true){
	System.out.print("\nYes! both ten and thirty are present in array.");break;

}

    else if(array[i] == 10){isTen = true;}
    else if(array[i] == 30){isThirty = true;}
}

    if(isTen == false){
      System.out.print("\nTen is not found.");
}
    if(isThirty == false){
      System.out.print("\nThirty is not found.");
}
}
}

public class main{
  public static void main(String args[]){
    Numbers number = new Numbers();
    number.checkNumbers();
}
}