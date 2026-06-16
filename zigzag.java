
public class zigzag {
    public class node{
        int data;
        node next;
        public  node(int data){
            this.data = data;
            this.next= null;
        }
    }

    public static node head;


    //function for finding mid node

    public static node findMid(){
        node slow = head;
        node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    
    //Function for finding zig zig pattern
    public static void  zigzag(){
        //find mid 
        node middleNode  = findMid();

        //reversing the linked list 

        node prev = null;
        node curr = middleNode;
        
        while( curr!=null){
            node next  = prev.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }

        //alternate merging.

    }
    public static void main(String[] args) {
        
    }
}
