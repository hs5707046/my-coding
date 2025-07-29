class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}

 class Singly{
    Node head=null;
    Node tail=null;
    int size=0;
    void insertAtend(int val){
        Node temp=new Node(val);
      if(head==null){
           head=temp;
      }
      else{
        tail.next=temp;
      }
      tail=temp;
      size++;
    }
    void insertAtbeginning(int val){
    Node temp=new Node(val);
    if(head==null){
        head=temp;
        tail=temp;
    }
    else{
         temp.next=head;
         head=temp;
    }
    size++;
    }
    void insertAt(int idx,int val){
        
        Node t=new Node(val);
        if(idx==size){
            insertAtend(val);
            return;
        }
        else if(idx==0){
            insertAtbeginning(val);
            return ;
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        size++;

    }
    void deleteAtindex(int idx){
        if(idx==0){
            head=head.next;
        }
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

   
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}

public class LinkedList{
    public static void display(Node head) {
        if(head==null){
            return ;
        }
        System.out.println(head.val);
        display(head.next);
    }
 public static void main(String[] args) {
      Node a=new Node(1);
       Node b=new Node(2);
        Node c=new Node(3);
         Node d=new Node(4);
          Node e=new Node(5);
      a.next=b;
      b.next=c;
      c.next=d;
      d.next=e;
      Node temp=a;
      while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
      }
      System.out.println();
      display(a);
      Singly obj=new Singly();
      obj.insertAtend(3);
       
       
       obj.insertAtbeginning(1);
       obj.insertAt(1,2);
       obj.display();
       System.out.println(obj.size);
          obj.deleteAtindex(1);
          obj.display();
    }
}