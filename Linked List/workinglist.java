public class MyClass {
        
    static Node head;
        
        static class Node{
            int data;
            Node next;
            
            Node(int d){
                this.data = d;
                this.next = null;
            }
        }
        Node reverse(Node node){
            Node cur = head;
            Node prev = null;
            
            while(cur != null){
                Node temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            node = prev;
            return node;
        }
        
        void print(Node node){
            Node cur = head;
            while(cur != null){
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }
    
    public static void main(String args[]) {
        
        MyClass obj = new MyClass();
        
        obj.head = new Node(10);
        obj.head.next = new Node(20);
        obj.head.next.next = new Node(30);
        obj.head.next.next.next = new Node(40);
        obj.head.next.next.next.next = new Node(50);
        obj.head.next.next.next.next.next = new Node(60);
        
        System.out.println("Given Linked List");
        obj.print(head);
        
        System.out.println();
        head = obj.reverse(head);
        
        System.out.println("Reverse Linked List");
        obj.print(head);
     
    }
}
