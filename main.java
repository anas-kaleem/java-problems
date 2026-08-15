import java.util.Scanner;

class Product{

  private int array1[] = new int[4];
  private int array2[] = new int[4];
  private int result[] = new int[4];
  public void multiplyArrays(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < array1.length; i++){
      System.out.printf("\nEnter number# %d of array1: ",i);
      array1[i] = scanner.nextInt();     
}//first-for-loop

    for(int i = 0; i < array2.length; i++){
      System.out.printf("\nEnter number# %d of array2: ",i);
      array2[i] = scanner.nextInt();  
}//second-for-loop

    for(int i = 0; i < array1.length; i++){
      result[i] = (array1[i] * array2[i]);
}
    System.out.print("\nResult: ");
    for(int i = 0; i < result.length; i++){
      System.out.printf("%d ",result[i]);
}
}//multipleArrays()

}//class-Multiplicaion

public class main{
  public static void main(String args[]){
    Product product = new Product();
    product.multiplyArrays();
}
}