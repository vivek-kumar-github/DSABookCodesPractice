public class resizingArrayQue1 {
    int[] items;
    int n;
    int first;
    int last;
    resizingArrayQue1(){
        items = new int[5];
    }
    public int size(){
        return n;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public boolean isFull(){
        return n == items.length;
    }
    public void enque(int val){
        if(isFull()){
            throw new RuntimeException("Queue is Full");
        }
        if(!isFull()){
            if(last == items.length){
                last = 0;
            }
        }
        items[last++] = val;
        n++;
    }
    public int deque(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }else{
            int x = items[first];
            //items[first] = null it is not needed here because loitering does not happen with primitive types.
            first++;
            if(first == items.length){
                first = 0;
            }
            n--;
            return x;
        }
    }

    public static void main(String[] args) {
        resizingArrayQue1 qu = new resizingArrayQue1();
        System.out.println(qu.isFull());
        qu.enque(1);
        qu.enque(1);
        qu.enque(1);
        qu.enque(4);
        qu.enque(5);
        System.out.println(qu.isFull());
        System.out.println(qu.deque());
    }
}
