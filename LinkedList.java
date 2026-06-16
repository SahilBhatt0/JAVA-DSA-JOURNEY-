
public class LinkedList {

    // Node class
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

    // 🔹 Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // 🔹 Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // 🔹 Print list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 🔹 Add at any index
    public void add(int index, int data) {
        // Invalid index check
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        // If inserting at beginning
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        // Move to (index-1) position
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // If inserted at last, update tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // 🔹 Remove first node
    public int removeStart() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;
        return val;
    }

    // 🔹 Remove last node
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // Find second last node
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // last node's data
        prev.next = null;         // remove last node
        tail = prev;              // update tail
        size--;

        return val;
    }

    // 🔹 Iterative search
    public int iteratorSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    // 🔹 Recursive helper
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    // 🔹 Recursive search
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    //     Reverse Linked List

    public void reverse(Node head){

        Node prev =null;
        Node curr = tail =  head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    // find and remove node 

    public void dFrmEnd(int n ){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return; 
        }
        int i = 1;
        int indexs = sz-n;
        Node prev = head;
        while( i < indexs){
            prev = prev.next;
            i++;    
        }
       
        prev.next = prev.next.next;
        return;
    
    }
    
    // check if the linked list is palindrome or not

    public Node midFinder(Node head){
        //this is called Slow Fast method 
        Node fast =head;
        Node slow  = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    public boolean checkPali(){
        //base / edge condition 
        if (head==null && head.next==null){
            return true;
        }

        //find the mid point
         Node midPoint  = midFinder(head);

        //reverse the second half 

        Node prev = null;
        Node curr = midPoint;
        
        while( curr!=null){
            Node next  = prev.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        //check  1st half and 2nd half if they are equal 
        
        Node left  = head;
        Node right  = prev;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Detect a cycle in a linked list 

    public static boolean detectCycle(){
        Node fast2 = head;
        Node slow2 = head;

        while(fast2!=null && fast2.next!=null){
            slow2 = slow2.next;
            fast2 = fast2.next.next;

            if(slow2 == fast2){
                return true;
            }
        }
        return false;
    }
    // 🔹 Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(2);
        list.addFirst(1);
        list.printList(); // 1 -> 2 -> null

        list.addLast(3);
        list.addLast(4);
        list.printList(); // 1 -> 2 -> 3 -> 4 -> null

        list.add(2, 9);
        list.printList(); // 1 -> 2 -> 9 -> 3 -> 4 -> null

        System.out.println(list.iteratorSearch(4));   // index
        System.out.println(list.iteratorSearch(10));  // -1

        System.out.println(list.recursiveSearch(4));  // index
        System.out.println(list.recursiveSearch(10)); // -1

        System.out.println(list.removeStart()); // remove first
        list.printList();

        System.out.println(list.removeLast());  // remove last
        list.printList();

        System.out.println(detectCycle());
        
    }
}