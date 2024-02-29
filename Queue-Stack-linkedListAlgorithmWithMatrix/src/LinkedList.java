public class LinkedList {
    Node head;
    int size;

    public boolean isEmpty()
    { return head == null; }
    public LinkedList() {
        head = null;
        size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int Size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void add(int s){
        Node nn = new Node();
        nn.setData(s);
        nn.setNext(head);
        head = nn;
        size++;
    }
    public void addLast(int data) {
        Node newNode = new Node();
        newNode.setData(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;


            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }


            currentNode.setNext(newNode);
        }

        size++;
    }
    public void remove() {
        if (head == null) {
            return; // list is empty
        }
        head = head.next; // remove head node
    }



    public int get(int index) {//returns the data at the given index//
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    public void set(int index, int data) {

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setData(data);
    }



}