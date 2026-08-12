import java.util.Scanner;

class Capital{
  private char text[];
  public void capitalizeText(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the text");
    text = scanner.nextLine().toCharArray();
    text[0] = Character.toUpperCase(text[0]);
    for(int i = 0; i < text.length; i++){
      if(text[i] == '.'){
        text[i+2] = Character.toUpperCase(text[i+2]); 
}
}
    for(int j = 0; j < text.length; j++){
      System.out.print(text[j]);
}
}
}


public class main{
  public static void main(String args[]){
    Capital capital = new Capital();
    capital.capitalizeText();
}
}
