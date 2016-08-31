import java.util.*;
import java.io.*;
class LinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    void printReverse(Node head)
    {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.data+" ");
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String args[])
    {    Scanner sc=new Scanner(System.in);
        LinkedList llist = new LinkedList();
        int  n=sc.nextInt(); 
      for(int i=0;i<n;i++)
       {  
        llist.push(sc.nextInt());
       }
 
        llist.printReverse(llist.head);
    }
}