import java.util.Scanner;

class ArrayOccurence{
  private int inputNum;
  private int index;
  private boolean isTrue = false;
  private int numbers[] = {2,4,8,9,3,10,20,2,5,4,55};
  public void findNumber(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number you want to search: ");
    inputNum = scanner.nextInt();
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == inputNum){
      index = i;
      isTrue = true;
      break;
}
}

  if(isTrue == true){
    System.out.printf("\nCongrats! the number occurs at: %d", index);
}
}
}

public class main{
  public static void main(String args[]){
    ArrayOccurence arrayOccurence = new ArrayOccurence();
    arrayOccurence.findNumber();
}
}