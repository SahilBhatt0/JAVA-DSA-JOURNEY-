//implementation using Array list 

import java.util.ArrayList;

public class stack {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
        return list.size() == 0;
    }

    // push

    public static void push(int data) {
        list.add(data);
    }

    // pop

    public static int pop() {
        // this is the corner case if stack is empty then return-1.
        if (isEmpty()) {
            return -1;
        }
        int top = list.size() - 1;
        list.remove(top);
        return top;
    }

    // peek
    public static int peek() {
        // this is the corner case if stack is empty then return-1.
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        // ye last mai check kiya hai ki jab tk stack empty nhi ho jaata tab tk top ko
        // peek kro aur print karo then pop karo.
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }

}