import java.util.Scanner;
import java.util.Arrays;
class MergedArrays{
  private int array1[] = {2,4,5,8,11};
  private int array2[] = {1,3,7,9};
  private int array3[] = new int[array1.length + array2.length];
  public void mergeArrays(){
    int temp1 = 0; int temp2 = 0; int box;
    for(int i = 0; i < array3.length; i++){
      if(i < array1.length){
	for(int j = i; j < array2.length; j++){
	  if(array1[i] > array2[j]){
	    box = array2[j];
	    array3[i] = box;
	    i = i + 1;j = j + 1;
}//1st-innerIf-1st-innerfor-1st-innerIf-1st-for
	  else{array3[i] = array1[i]; i = i + 1;j = j + 1;}	  
	  temp1 = temp1 + 1;
}//1st-innerfor-1st-innerif-1st-for

}//1st-if-1st-for
      else if(i >= array1.length){
  	array3[i] = array2[temp2];
        temp2 = temp2 + 1;
}
}//1st-for

    System.out.print("\nArray1: " + Arrays.toString(array1));
    System.out.print("\nArray2: " + Arrays.toString(array2));
    System.out.print("\nSorted Array3: " + Arrays.toString(array3));
}
}

public class main{
  public static void main(String args[]){
    MergedArrays mergedArray = new MergedArrays();
    mergedArray.mergeArrays();
}
}