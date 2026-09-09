import java.util.Scanner;

class Node{
  int value;
  Node next;
  Node prev;
}

class Head{
  Node head;
}

class Current{
  Node current;
}

class List{
  private int size = 0;
  public void createList(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter first number: ");
    Head header = new Head();
    Current back = new Current();
    Current front = new Current();
    header.head = new Node();
    front.current = header.head;
    back.current = header.head;
    header.head.value = scanner.nextInt();

    for(int i = 2; i <= 7; i++){
      System.out.printf("\nEnter %dth number: ", i);
      front.current = new Node();
      front.current.value = scanner.nextInt();
      back.current.next = front.current;
      front.current.prev = back.current;
      back.current = front.current;
      size = size + 1;
}//first-for-createList()
    front.current = header.head;
    int temp;
    for(int j = 1; j <= (size / 2); j++){
      temp = front.current.value;
      front.current.value = back.current.value;
      back.current.value = temp;
      front.current = front.current.next;
      back.current = back.current.prev;
}

    front.current = header.head;
    for(int i = 1; i <= 7; i++){
      System.out.printf("\n%d", front.current.value);
      front.current = front.current.next;
}
}//void-createList()
  
 
}//class-List{}

public class main{
  public static void main(String args[]){
    List lists = new List();
    lists.createList();
}
}