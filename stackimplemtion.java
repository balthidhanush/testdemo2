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
    }
}