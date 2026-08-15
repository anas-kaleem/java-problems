import java.util.Scanner;

class StringSum{
  private String text;
  private String subString = "";
  public void changeText(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the text: ");
    text = scanner.nextLine();

    for(int i = text.length() - 3; i < text.length(); i++){
      subString = subString + text.charAt(i);
}//for-loop

    text = subString + text + subString;
    System.out.print(text);
}//chageText()
}//class-StrignNum{}

public class main{
  public static void main(String args[]){
    StringSum stringSum = new StringSum();
    stringSum.changeText();
}
}