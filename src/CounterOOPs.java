 public class CounterOOPs {
     private final String name;
     private int count;

     public CounterOOPs(String id) {
         name = id;
     }

     public void increment() {
         count++;
     }

     public int tally() {
         return count;
     }

     public String toString() {
         return count + " " + name;
     }

     public static void main(String[] args) {
         CounterOOPs heads = new CounterOOPs("heads");
         CounterOOPs tails = new CounterOOPs("tails");
         heads.increment();
         heads.increment();
         tails.increment();
         StdOut.println(heads + " " + tails);
         StdOut.println(heads.tally() + tails.tally());
     }
 }