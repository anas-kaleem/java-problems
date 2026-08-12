import java.util.Scanner;

class Reverse{
  private String inputText;
  private String outputText = "";
  public void reverseText(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the text: ");
    inputText = scanner.nextLine();
    
    for(int i = (inputText.length() - 1); i >= 0; i--){
      outputText = outputText + inputText.charAt(i);  
}//for-loop-in-reverseText()

    System.out.print(outputText);
}//void-reverseText()
}//class-Reverse{}

public class main{
  public static void main(String args[]){
    Reverse reverse = new Reverse();
    reverse.reverseText();
}
}