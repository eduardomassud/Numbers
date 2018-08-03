public class Node {
    
  int value;
  Node next;

  public Node(int value){
    this.value = value;
    next = null;
  }

  public Node(int value, Node next){
    this.value = value;
    next = next;
  }

  public int getValue(){
    return this.value;
  }

  public Node getNext(){
    return this.next;
  }

  public void setValue(int value){
    this.value = value;
  }

  public void setNext(Node next){
    this.next = next;
  }
}