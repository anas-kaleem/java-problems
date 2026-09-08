import java.util.Scanner;

class Node{
  int value;
  Node next;
}

class Head{
  Node head;
}

class Cursor{
  Node current;
}

class List{
  public void createList(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter values for list: ");
    Head heads = new Head();
    Cursor cursor1 = new Cursor();
    Cursor cursor2 = new Cursor();
    for(int i = 1; i <= 10; i++){
      if(i == 1){
	Node node = new Node();
        cursor1.current = node;
	heads.head = node;
        System.out.printf("\nEnter %dth value: ",i);
	node.value = scanner.nextInt();
}

      else if(i > 1){
	System.out.printf("\nEnter %dth value: ",i);
  	cursor2.current = new Node();
	cursor2.current.value = scanner.nextInt();
	cursor1.current.next = cursor2.current;
	cursor1.current = cursor1.current.next;
}
       
}

    cursor1.current = heads.head;
    cursor2.current = heads.head;
    for(int i = 1; i <= 10; i++){
      System.out.printf("\n%dth value in linked list: %d",i, cursor1.current.value);
      cursor1.current = cursor1.current.next;
}
    cursor1.current = heads.head;
}
}

public class main{
  public static void main(String args[]){
    List lists = new List();
    lists.createList();
}
}