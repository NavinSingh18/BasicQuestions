public class MyClass {
    
    
    Node head;
    private int size;
    
    MyClass(){
        this.size = 0;
    }
    
     class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addFirst(String data){
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = newNode;
        }
        Node curr = head;
        
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
       
    }
    
    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        
         head = head.next;
         size--;
        
    }
    
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        size--;
        
        Node cur = head;
        Node curN = head.next;
        while(curN.next != null){
            curN = curN.next;
        }
        cur.next = null;
    }
    
    public void print(){
        Node curr = head;
        
        while(curr !=null){
            System.out.print(curr.data + "->" );
            curr = curr.next;
        }
        //System.out.println("null");
        System.out.println();
    }
    
    public int Size(){
        return size;
    }
    
    public static void main(String args[]) {
        MyClass n = new MyClass();
        n.addFirst("is");
        n.addFirst("a");
        n.print();
        System.out.println(n.Size());
        n.addLast("something");
        n.print();
        System.out.println(n.Size());
        n.deleteFirst();
        n.print();
        System.out.println(n.Size());
        n.deleteLast();
        n.print();
        System.out.println(n.Size());
     
    }
}
