public class doublyLLtail {
    node head;
    node tail;
    int size=0;
    private class node{
        int data;
        node next;
        node prev;
        node(int x)
        {
            this.data = x;
            this.next = null;
            this.prev = null;
        }
    }
    private void addtail(int data)
    {
        node temp = new node(data);
        if(head == null)
        {
            head = temp;
            tail = head;
            size++;
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        size++;
    }
    private void print()
    {
        node temp = head;
        while(temp!=tail){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
    public static void main(String[] args) {
        doublyLLtail s = new doublyLLtail();
        s.addtail(10);
        s.addtail(50);
        s.addtail(77);
        s.print();
    }
}
