import java.util.Scanner;

class Matrix{
  private int numbers[][] = {{1,5,6,9,9,23},{23,8,10,14}};
  private int inputNum;
  private boolean isTrue = false;
  public void searchMatrix(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number that you want to search: ");
    inputNum = scanner.nextInt();
    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers[i].length; j++){
	if(numbers[i][j] == inputNum){
	  System.out.printf("\nYes! the number is present at: %dth column of %dth row", j + 1, i + 1);
	  isTrue = true;
	  break;
}
}
      if(isTrue == true){break;}
}
    if(isTrue == false){
	System.out.print("\nSorry! number has not found.");
}
}
}

public class main{
  public static void main(String args[]){
    Matrix matrix = new Matrix();
    matrix.searchMatrix();
}
}