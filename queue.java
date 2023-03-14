import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Queue queue=new LinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }
        queue.remove();
        queue.remove();
        System.out.println("front element is"+queue.peek());
        System.out.println("size of queue"+queue.size());
        if(queue.isEmpty()){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("queue is not empty");
        }
    }
}
