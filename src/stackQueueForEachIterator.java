import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

import java.lang.management.GarbageCollectorMXBean;

public class stackQueueForEachIterator {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(23);
        for(int x : st){
            System.out.println(x);
        }

        Queue<Integer> qu = new Queue<>();
        qu.enqueue(12);
        qu.enqueue(23);
        for(int y : qu){
            System.out.println(y);
        }
        Bag<Integer> bg = new Bag<>();
        bg.add(12);
        bg.add(23);
        for(int z : bg){
            System.out.println(z);
        }
    }
}
