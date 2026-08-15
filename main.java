import java.util.Scanner;

class Word{
  private String text;
  private boolean isTrue = false;
  public void isWord(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the text: ");
    text = scanner.nextLine();
    for(int i = 0; i < text.length(); i++){
      int asciiValue = (int) (text.charAt(i));
      if((asciiValue >= 97 && asciiValue <= 122) || (asciiValue >= 65 && asciiValue <= 90)){
  	isTrue = true;
   	break;
}

}

    System.out.print(isTrue);
}
}

public class main{
  public static void main(String args[]){
    Word word = new Word();
    word.isWord();
}
}