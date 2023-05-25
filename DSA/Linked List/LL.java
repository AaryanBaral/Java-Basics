import java.util.*;


class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    } 
    public void PrintList(){
        while(head.next!=null){
            System.out.print(head.data+"----> ");
            head = head.next;
        }
        System.out.print(head.data+"----> Null");
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("Aaryan");
        list.addFirst("Is");
        list.addFirst("Name");
        list.addFirst("My");
        list.addFirst("Hello");
        list.addLast("Baral");
        list.PrintList();
    }
}