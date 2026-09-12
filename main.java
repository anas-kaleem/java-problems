import java.util.Scanner;
import java.util.Arrays;

class Duplicates{
  private int numbers[] = {1,1,2,3,3,4,5,6,7,7,7,7};
  private int arrayCopy[];
  private int tempArray[];
  private int count;
  private int sizeAscend = 0;
  private int sizeDescend = numbers.length;
  private int after;
  private boolean isTrue = false;
  private int temp;

  public void removeDup(){
    for(int i = 0; i < numbers.length; i++){
      	after = 1;
	count = 1;
	isTrue = false;
       	temp = numbers[0];
       	numbers[0] = numbers[i];
      	numbers[i] = temp;
      	for(int j = 1; j < numbers.length; j++){
	  if(numbers[j] == numbers[0]){
 	    count = count + 1;
}
	if(count == 2  && i == 0){
	  isTrue = true;
	  sizeDescend = sizeDescend - 1;
	  arrayCopy = new int[sizeDescend];
  	  temp = 0;  
	  int temp2;
	  for(int k = 0; k < numbers.length; k++){
	    if(number.length != numbers[0]){
	      arrayCopy[temp] = numbers[k];
	      temp = temp + 1;
}
}
}
	else if(count == 2 && i > 0){
	  isTrue = true;
	  temp = numbers[0];
	  sizeDescend = sizeDescend - 1; 
}
	if(isTrue == true){
	  boolean makeArray = true;
	  for(int l = 0; l < arrayCopy.length; l++){
	    if(arrayCopy[l] == numbers[0]){
	      makeArray = false;
	      break;
}
}
	  if(makeArray == true){
	    arrayCopy = new int[sizeDescend];
  	    temp = 0;  
	    for(int k = 0; k < numbers.length; k++){
	      if(number.length != numbers[0]){
	        arrayCopy[temp] = numbers[k];
	        temp = temp + 1;
}
}
}
}

 	else if(isTrue == false){arrayCopy = Arrays.copyOf(numbers);}
}

    System.out.print("Resultant array: " + Arrays.toString(arrayCopy));
}
}

public class main{
  public static void main(String args[]){
    Duplicate duplicate = new Duplicate();
    duplicate.removeDup();
}
}