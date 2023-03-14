import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack stack=new Stack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println("The stack size is " + stack.size());
        System.out.println("The top element is " + stack.peek());
        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}