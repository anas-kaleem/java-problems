import java.util.Scanner;
import java.util.Arrays;

class Duplicates{
  private int numbers[] = {1,1,2,3,3,3,4,5,6,7,7};
  private int tempArray[] = Arrays.copyOf(numbers, numbers.length);
  private int extraArray[] = Arrays.copyOf(tempArray, tempArray.length);
  private int after;
  private int index;
  private int size = tempArray.length;
  public void removeDup(){
    for(int i = 0; i < tempArray.length - 1; i++){
      for(after = i + 1; after < tempArray.length; after++){
  	if(tempArray[i] == tempArray[after]){
	  index = after;
	  size = size - 1;
	  extraArray = new int[size];
	  int j = 0;
	  for(int m = 0; m < tempArray.length; m++){
	    if(m != index){
	      extraArray[j] = tempArray[m];
	      j = j + 1;
}
}
	  
	  tempArray = Arrays.copyOf(extraArray, extraArray.length);
}
      	after = after + 1;
}
}

    System.out.print("\nThe resultant array: " + Arrays.toString(tempArray));
}
}

public class main{
  public static void main(String args[]){
    Duplicates duplicate = new Duplicates();
    duplicate.removeDup();
}
}