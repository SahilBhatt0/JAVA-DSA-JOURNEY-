public class deleteloopll {

    public static  class Node {
        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

public static void deleteCycle(){
//detect loop in the list

Node fast = head;
Node slow = head;
boolean cycle = false;
while(fast != null && fast.next !=null){
    slow =  slow.next;
    fast = fast.next.next;
    if(fast==slow){
        cycle= true;
        break;
    }
}
if(cycle==false){
    System.out.println("No cycle Found");
    return;
}

//find the meeting point 
slow = head;
Node prev  = null;
while(slow!=fast){
    prev = fast;
    slow = slow.next;
    fast = fast.next;

}
prev.next  =null;

}
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next  =head;
        head=newNode;
    }

    public static void printList2(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        deleteloopll newList = new deleteloopll();
        newList.addFirst(1);
        newList.addFirst(2);
        newList.addFirst(2);
        newList.addFirst(1);
        head.next.next.next =head.next;
         
        deleteCycle();
        printList2();

    }
}