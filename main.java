import java.util.Scanner;

class Pointer{
  Node pointer;
}

class Node{
  int value;
  Node next;
}

class MergedLists{
  private int size1;
  private int size2;
  public void mergeLists(){
    Pointer firstHead = new Pointer();
    Pointer firstCurrent1 = new Pointer();
    Pointer firstCurrent2 = new Pointer();
    Pointer firstTail = new Pointer();
    firstHead.pointer = new Node();
    firstCurrent1.pointer = firstHead.pointer;
    firstCurrent2.pointer = firstHead.pointer;

    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter size of list1: ");
    size1 = scanner.nextInt();
    System.out.print("\nEnter 1st number of list1: ");
    firstCurrent2.pointer.value = scanner.nextInt();
    for(int i = 2; i <= size1; i++){
      System.out.printf("Enter %dth value of list1: ", i);
      firstCurrent2.pointer = new Node();
      firstCurrent2.pointer.value = scanner.nextInt();
      firstCurrent1.pointer.next = firstCurrent2.pointer;
      firstCurrent1.pointer = firstCurrent2.pointer;
}
    firstTail.pointer = firstCurrent2.pointer;
    firstCurrent1.pointer = firstHead.pointer;
    firstCurrent2.pointer = firstHead.pointer;

    System.out.print("\n");

    Pointer secndHead = new Pointer();
    Pointer secndCurrent1 = new Pointer();
    Pointer secndCurrent2 = new Pointer();
    Pointer secndTail = new Pointer();

    secndHead.pointer = new Node();
    secndCurrent1.pointer = secndHead.pointer;
    secndCurrent2.pointer = secndHead.pointer;
    System.out.print("\nEnter the size of list2: ");
    size2 = scanner.nextInt();
    System.out.print("\nEnter 1st value of list2: ");
    secndHead.pointer.value = scanner.nextInt();

    for(int j = 2; j <= size2; j++){
      secndCurrent2.pointer = new Node();
      System.out.printf("Enter %dth value of list2: ", j);
      secndCurrent2.pointer.value = scanner.nextInt();
      secndCurrent1.pointer.next = secndCurrent2.pointer;
      secndCurrent1.pointer = secndCurrent2.pointer;
}

    secndTail.pointer = secndCurrent2.pointer;
    secndCurrent1.pointer = secndHead.pointer;
    secndCurrent2.pointer = secndHead.pointer;

    firstTail.pointer.next = secndHead.pointer;

    for(int l = 1; l <= (size1 + size2); l++){
      System.out.printf("\nvalue at %d is: %d", l, firstCurrent1.pointer.value);
      firstCurrent1.pointer = firstCurrent1.pointer.next;
}

      firstCurrent1.pointer = firstHead.pointer;
}
}

public class main{
  public static void main(String args[]){
    MergedLists mergedList = new MergedLists();
    mergedList.mergeLists();
}
}

