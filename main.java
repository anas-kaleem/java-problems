import java.util.Scanner;
import java.util.Arrays;

class MergedArrays{
  private int array1[] = {1,4,5,6,8};
  private int array2[] = {2,3,7,10};
  private int size;
  private int array3[];
  public void mergeArrays(){
    size = array1.length + array2.length;
    array3 = new int[size];
    int temp1 = 0;
    int temp2 = 0;
    for(int i = 0; i < array3.length; i++){
      if(i < array1.length){
  	array3[i] = array1[temp1];
	temp1 = temp1 + 1;
}
      else if(i >= array2.length){
	array3[i] = array2[temp2];
	temp2 = temp2 + 1;
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