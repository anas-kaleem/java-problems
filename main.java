import java.util.Scanner;
import java.util.Arrays;

class MergedArrays{
  private int array1[] = {1,3,5,6,9,11};
  private int array2[] = {2,4,7,8};
  private int array3[] = new int[array1.length + array2.length];
  private int temp1 = 0;
  private int temp2 = 0;
  public void mergeArrays(){
    for(int i = 0; i < array3.length; i++){
      if(temp1 < array1.length && temp2 < array2.length){
	if(array1[temp1] < array2[temp2]){array3[i] = array1[temp1];temp1 = temp1 + 1;}
	else if(array2[temp2] < array1[temp1]){array3[i] = array2[temp2]; temp2 = temp2 + 1;}
}
      else if(temp1 < array1.length && temp2 == array2.length){
	array3[i] = array1[temp1];temp1 = temp1 + 1;
}

      else if(temp1 == array1.length && temp2 < array2.length){
	array3[i] = array2[temp2]; temp2 = temp2 + 1;
}
      
}

    System.out.print("\nArray1: " + Arrays.toString(array1));
    System.out.print("\nArray2: " + Arrays.toString(array2));
    System.out.print("\nArray3: " + Arrays.toString(array3));
}
}

public class main{
  public static void main(String args[]){
    MergedArrays mergedArray = new MergedArrays();
    mergedArray.mergeArrays();
}
}