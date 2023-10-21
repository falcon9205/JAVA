public class LLcontaincycle {
    node head;
    node tail;
    int size=0;
    private class node{
        int data;
        node next;
        node(int x)
        {
            this.data = x;
            this.next = null;
        }
    }
    private void add(int data)
    {
        node temp = new node(data);
        if(head == null)
        {  size++;
            temp.next = temp;
            head = temp;
            tail = head;
            return;
        }
        temp.next = head;
        head = temp;
        tail.next = head;
        size++;
        // System.out.println(head.data);
    }
    private void print(){
        node temp = head;
        for(int i=1;i<=size;i++)
        {
         System.out.print(temp.data+" ");
         temp = temp.next;
        }
        System.out.println();
    }
    private boolean hascycle()
    {
        node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        LLcontaincycle s = new LLcontaincycle();
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
        System.out.println(s.hascycle());
    }
}
