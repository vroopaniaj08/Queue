import java.util.Queue;

public class q7 {
    static class node{
        int data;
        node next;
        node (int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        node head = null;
        public boolean isEmpty(){
            if(head == null){
//                System.out.println("list is empty");
                return true;
            }
            return false;
        }
        public void enqueue(int data){
            node newnode = new node(data);
            if(isEmpty()){
                head = newnode;
            }
            node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = newnode;
            newnode.next = null;
        }
        public int dequeue(){
            if(isEmpty()){
                return -1;
            }
            int ele = head.data;
            head = head.next;
            return ele;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;

        }
    }

    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(5);
        Q.enqueue(6);
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.dequeue();
        }
    }
}
