import java.util.Scanner;

class FirstOccurence{
  private String mainText;
  private String searchText;
  private int temp = 0;
  private String occurence = "";
  public void findString(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the text: ");
    mainText = scanner.nextLine();
    System.out.print("\nEnter the text to search: ");
    searchText = scanner.nextLine();
    mainText = mainText.toUpperCase();
    searchText = searchText.toUpperCase();
    for(int i = 0; i < mainText.length(); i++){
      if(temp >= searchText.length()){
	break;
}
      else if(searchText.charAt(temp) == mainText.charAt(i)){
	occurence = occurence + i;
	temp = temp + 1;
}

      else if(searchText.charAt(temp) != mainText.charAt(i)){
	occurence = "";
    	temp = 0;
}
}

    System.out.printf("\nThe occurence of the text you want to search is: %s", occurence);
}
}

public class main{
  public static void main(String args[]){
    FirstOccurence firstOccurence = new FirstOccurence();
    firstOccurence.findString();
}
}