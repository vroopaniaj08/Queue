public class q8 {
    static int rear = -1;
    static class Queue{
        int size;
        int []arr;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public boolean isEmpty(){
            return (rear == -1);
        }
        public boolean isFull(){
            return (rear == size-1);
        }
        public void enqueue(int data){
            if(isFull()){
                System.out.println("full");
                return;
            }
            arr[++rear] = data;
        }
        public int dequeue(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int front = arr[0];
            for (int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue Q = new Queue(5);
//        System.out.println(Q.isEmpty());
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(5);
        Q.dequeue();
        Q.enqueue(6);
        while(!Q.isEmpty()){
            System.out.println(Q.dequeue());
        }
    }
}
