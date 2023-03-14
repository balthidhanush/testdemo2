import java.util.*;
public class Main {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList(); //creating list
        
        Scanner sc = new Scanner(System.in); //creating scanner for total elements to be inserted in list
        System.out.println("enter total count of elements -> ");
        int num = sc.nextInt(); // user will enter total elements
        
        while(num>0) { 
        ll.add(sc.nextInt());
        num--;  // decrement till the index became 0    
        }
        System.out.println(ll);
    }
}