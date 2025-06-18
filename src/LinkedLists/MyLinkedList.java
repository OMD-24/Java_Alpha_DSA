package LinkedLists;



public class MyLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        }


        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data) {
            //step-1 : Create a new node
            Node newNode = new Node(data);

            {
                // if the node is empty at first
                if (head == null) {
                    head = tail = newNode;
                    size++;
                    return;
                }
            }


            //step-2 : assign head
            newNode.next = head;

            //jump to new head
            head = newNode;
            size++;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null");
        }


        public void addLast(int data) {
            //step-1 : Create a new node
            Node newNode = new Node(data);
            {
                // if the node is empty at first
                if (head == null) {
                    head = tail = newNode;
                    size++;
                    return;

                }
            }
            //step-2 : assign head
            tail.next = newNode;
            //jump to new head
            tail = newNode;
            size++;
    }
    public void addMiddle(int idx, int data){

            if(idx == 0){
                addFirst(data);
                return;
            }

            Node temp = head;
            int i = 1;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            Node newNode = new Node(data);
            newNode.next=temp.next;
            temp.next= newNode;

    }

    public int removeFirst(){
            if(size==0){
                System.out.println("LL is Empty");
                return Integer.MIN_VALUE;
            }

            if (size==1){
                int val = head.data;
                head=tail=null;
                size = 0;
                return val;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
    }

    public void removeLast(){

    }

    public static void main(String [] args){
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.addMiddle(4,0);
        ll.removeFirst();
        ll.print();
        System.out.println();
    }
}
