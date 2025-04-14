import java.util.Iterator;
public class Bag1<Item> implements Iterable<Item>
{
    private Node first;  // first node in list
    private  class Node
    {
        Item item;
        Node next;
    }
    public void add(Item item)
    {
// same as push() in Stack
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    public Iterator<Item> iterator()
    {  return new ListIterator();  }
    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext()
        {  return current != null;  }
        public void remove() { }
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Bag1<Integer> bg = new Bag1<>();
        bg.add(1);
        bg.add(2);
        bg.add(3);
        for(int i : bg){
            System.out.println(i);
        }
    }
}
