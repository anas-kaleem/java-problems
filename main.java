import java.util.Scanner;

class RotatedText{
  private String userText;
  private String text1 = "";
  private String text2 = "";
  private int index;
  public void rotateText(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the text: ");
    userText = scanner.nextLine();
    for(int i = 0; i < userText.length(); i++){
      if(userText.charAt(i) == ' '){
	index = i + 1;
	for(int j = index; j < userText.length(); j++){
	  text2 = text2 + userText.charAt(j);
}
        break;
}
      else{text1 = text1 + userText.charAt(i);}
}

	System.out.print("\nResult: " + text2 + text1);
}
}

public class main{
  public static void main(String args[]){
    RotatedText rotatedText = new RotatedText();
    rotatedText.rotateText();
}
}