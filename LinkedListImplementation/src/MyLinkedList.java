public class MyLinkedList {

    // reference to first node in the linked list
    Node head;

    // returns the number of nodes in the linked list
    public int size(){
        return 0;
    }


    // returns the state of linked list
    public boolean isEmpty(){
        if(head == null)
            return true;

        return false;
    }

    // adds a node to the end of the linked list
    public void add(int data){

        if (isEmpty()){
            head = new Node(data);
        }
        else{

            Node temp = head;

            while (temp!=null){

                temp = temp.next;
            }
            temp = new Node(data);
        }

    }

    // returns the value(data) in the node at the given index
    public int get(int index){
        return 0;
    }

    // removes the corresponding node with the given data from the linked list
    public void remove(int data){

    }

    // prints the elements in the linked list
    public void display(){

    }
}
