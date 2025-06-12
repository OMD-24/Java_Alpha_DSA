package LinkedLists;

import java.util.LinkedList;

public class AddNode {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        //step-1 : Create a new node
        Node newNode = new Node(data);

        {
            // if the node is empty at first
            if (head==null){
                head=tail=newNode;
                return;
            }
        }


        //step-2 : assign head
        newNode.next = head;

        //jump to new head
        head = newNode;
    }



    public static void addLast(int data){

        //step-1 : Create a new node
        Node newNode = new Node(data);

        {
            // if the node is empty at first
            if (head==null){
                head=tail=newNode;
                return;
            }
        }


        //step-2 : assign head
        tail.next = newNode;

        //jump to new head
        tail = newNode;
    }

    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

        ll.addLast(3);
        ll.addLast(4);

        System.out.println(ll);
    }
}
