// Reverse of Queue using Stack
//Approach- remove element and push in a stack then pop element and add to queue
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Queue<Integer>q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
         while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    public static void reverse(Queue<Integer> a){
        Stack<Integer>s= new Stack<>();
        while(!a.isEmpty()){
            s.push(a.remove());
        }
        while(!s.isEmpty()){
            a.add(s.pop());
        }
        
        
    }
}
    }
}
