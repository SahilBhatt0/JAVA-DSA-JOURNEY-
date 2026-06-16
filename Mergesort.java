public class Mergesort {
 
    public static class node{
        int data;
        node next;

        public node(int data){
           this.data = data;
           this.next = null;
        }
    }

public static node head;
public static node tail;

//Finding mid node.
public static node findMid(){
      node slow = head;
    node fast = head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

//MergeList function.

public node merge(node head1,node head2){
    node mergeLL = new node(-1);
    node temp = mergeLL; 

    while(head1 != null && head2 != null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head.next;
            temp = temp.next;
        }
        else{
            
                temp.next = head2;
                head2 = head2.next;
                temp=temp.next;
            
        }
    }
return mergeLL.next;
}

//Merge sort.
public node mergeLl(node head){
    //Base condition.
    if(head==null || head.next==null){
        return head;
    }
    // finding mid point 
    node mid  = findMid();

    //left and right half ke liye merge sort call krna hai.
    node rightHalf = mid.next;
    mid.next = null;
    node newLeft = mergeLl(head);
    node newRight = mergeLl(rightHalf);

    //Merge both of the half.
   return merge(newLeft , newRight);

}

//Funtion to add at first.

public static void addFirst(int data){
    node newNode  = new node(data);
    if(head==null){
       head = tail = newNode;
       return;
    }
     newNode.next = head;
        newNode = head;
}

public static void printList(){
    node temp = head;
    while(temp!=null){
        System.out.println(temp.data+ " ->");
        temp =temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    Mergesort ll = new Mergesort();

    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);

    ll.printList();
    
}
}

