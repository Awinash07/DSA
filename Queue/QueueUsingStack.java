package Queue;

import java.util.Stack;

public class QueueUsingStack {

    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static void enqueue(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        public static int dequeue(){
            while(!s1.isEmpty()){
                 return s1.pop();
            }
            return 0;
               
        }
        public static int peek(){
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
    }
    
}
