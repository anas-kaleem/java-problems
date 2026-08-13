import java.util.Scanner;

class Half{
  private String text;
  private boolean endLoop = false;
  private int halfLength;
  public void printHalf(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter text consisting of even number of letters: ");
    text = scanner.nextLine();

    while(endLoop == false){
      if(text.length() % 2 != 0){
        System.out.print("text consists of odd number of letters. enter text again: ");
	text = scanner.nextLine();   
}//if
      else{
  	endLoop = true;
}//else
}//while

    halfLength = text.length()/2;
    for(int i = 0; i < halfLength; i++){
      System.out.print(text.charAt(i));
}
}//func-printHalf()
}//class-half{}

public class main{
  public static void main(String args[]){
    Half half = new Half();
    half.printHalf();
    
}
}