package JavaCollectionAssignment2.question10;
class Node{
    int data;
    Node previous;
    Node next;
    Node(int d){
        data = d;
    }
}
public class Test10 {
    Node head;
    // add a node in front part of doubly linked list
    public  void push(int data){
        Node new_Node = new Node(data);
        new_Node.next = head;
        new_Node.previous = null;
        if(head != null){
            head.previous = new_Node;
        }else{
            head = new_Node;
        }
    }

    //insert a node after a given node
    public  void pushAfterNode(int new_data,Node previousNode){
        if(previousNode == null){
            System.out.println("Previous Node can not be null");
            return;
        }
        Node newNode = new Node(new_data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        newNode.previous = previousNode;
        if (newNode.next != null){
            newNode.next.previous = newNode;
        }

    }
    public static void main(String[] args) {

    }
}
