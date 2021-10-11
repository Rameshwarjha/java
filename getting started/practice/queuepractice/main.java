import java.util.*;



public class main {
    public static class Node{
        int data;
        ArrayList<Node>children = new ArrayList<>();
    }
    public static void main(String[] args){
        Queue<Integer>q = new ArrayDeque<>();

        for (int i=0; i<5; i++){
            // add in queue
            q.add(i);

        }
        System.out.println("contents of queue"+ q);

        // to remove the head
        // remove also returns the deleted head or value deleted
        int removedelement = q.remove();
        System.out.println(removedelement);

          // remove again the head
        int removehead = q.remove();
        System.out.println("remove the head and print the removed value = " + removehead);

        int head = q.peek();
        System.out.println("print head of  the queue = " + head);

        int size = q.size();
        System.out.println("size of the queue = " + size );
        


        Queue<String>queue = new PriorityQueue<>();

        queue.add("geeks");
        queue.add("for");
        queue.add("Geeks"); 

        System.out.println(queue);



        System.out.println("---------------------");
        Queue<Integer>pq= new PriorityQueue<>();

        pq.add(20);
        pq.add(10);
        
        pq.add(15);

        //printing the top element of priority queue
        System.out.println(pq.peek());

        // printing the top element and removing it from the priority 
        // queue
        System.out.println(pq.poll());

        //printing the top element again
        System.out.println(pq.peek());
        

        
    }

    
}
