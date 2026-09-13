import java.util.Scanner;

class Characters{
  private String userText;
  private int count = 0;
  private boolean isTrue = false;
  private int occurence;
  private int after;
  public void findUnique(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the text: ");
    userText = scanner.nextLine();
    for(int i = 0; i < userText.length() - 1; i++){
      isTrue = false;
      count = 0;
      after = i + 1;
      for(int j = after; j < userText.length(); j++){
   	if(userText.charAt(i) == userText.charAt(j)){
	  isTrue = true;
	  count = count + 1;
}
}
	if(isTrue == false && count == 0){  
	  occurence = i + 1;
	  break;
}
}
    if(isTrue == false){
      System.out.printf("\nYes! there is a unique letter at: %d", occurence);
}

    else if(isTrue == true){
      System.out.printf("\nNo! there is no unique letter in String");
}
}
}

public class main{
  public static void main(String args[]){
    Characters character = new Characters();
    character.findUnique();
}
}