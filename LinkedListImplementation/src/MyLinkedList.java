public class MyLinkedList {

    // reference to first node in the linked list
    Node head;

    // returns the number of nodes in the linked list
    public int size() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    // returns the state of linked list
    public boolean isEmpty() {
        if (head == null)
            return true;

        return false;
    }

    // adds a node to the end of the linked list
    public void add(int data) {
        // if list is empty, we create the very first node in the linked list
        if (isEmpty()) {
            head = new Node(data);
        }
        // list is not empty
        else {
            Node temp = head;

            while (temp.next != null) {

                temp = temp.next;
            }
            temp.next = new Node(data);
        }

    }

    // returns the value(data) in the node at the given index
    public int get(int index) {
        // validating the index
        if (index < 0 || index >= size())
            throw new IllegalArgumentException("Invalid Index");

        Node temp = head;
        int count = 0;

        while (count != index) {
            temp = temp.next;
            count++;
        }
        return temp.data;
    }

    // removes the corresponding node with the given data from the linked list
    public void remove(int data) {

        if (isEmpty())
            throw new RuntimeException("List is empty");

        Node temp = head;
        boolean isRemoved = false;

        while (temp != null && !isRemoved) {
            // at least second node is present
            if (temp.next != null) {
                // is the node to be removed first node itself
                if (temp.data == data) {
                    head = temp.next;
                    temp.next = null;
                    isRemoved = true;
                } else {
                    if (temp.next.data == data) {
                        // bypass next node to make a connection from curr node to next's next node
                        temp.next = temp.next.next;
                        // break the link from next node to it's next mode
                        temp.next.next = null;
                        isRemoved = true;
                    }
                }
            } else {
                head = null;
            }
            temp = temp.next;
        }


    }

    // prints the elements in the linked list
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
