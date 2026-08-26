import java.util.Scanner;

class Numbers{
  private int array[] = new int[7];
  private int countTen = 0;
  private int countTwenty = 0;
  public void countNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < array.length; i++){
      System.out.printf("\nEnter %dth number of array: ", i+1);
      array[i] = scanner.nextInt();
      
}

    for(int i = 0; i < array.length; i++){
      if(array[i] == 10){countTen = countTen + 1;}
      else if(array[i] == 20){countTwenty = countTwenty + 1;}
}

    if(countTen > countTwenty){System.out.printf("\nTen is more than twenty; Ten: %d Twenty: %d", countTen, countTwenty);}
    else if(countTwenty > countTen){System.out.printf("\nTweny is more than Ten; Ten: %d Twenty: %d",countTwenty, countTen);}
    else if(countTwenty == countTen){System.out.printf("\nTen and Twenty are equal Ten: %d Twenty: %d", countTen, countTwenty);}
}
}

public class main{
  public static void main(String args[]){
    Numbers number = new Numbers();
    number.countNumbers();
}
}