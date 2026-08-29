import java.util.Scanner;

class Stairs{
  private char coin = '$';
  private char emptySpace = ' ';
  public void createStairs(){
    Scanner scanner = new Scanner(System.in);
    int rows = 20;
    int columns = 7;
    for(int i = 1; i < rows; i++){
      for(int j = 0; j <= columns; j++){
	if((j == 0) || (j == columns)){System.out.print(coin);}
 	if(i % 2 == 0){
  	  System.out.print(coin);
}//if-in-2nd-for
  	else{System.out.print(emptySpace);}
 	
}//2nd-for
	System.out.print("\n");
}//first-for
}
}

public class main{
  public static void main(String args[]){
    Stairs stair = new Stairs();
    stair.createStairs();
}
}