public class doublyLLhead {
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
    private void addhead(int data)
    {
        node temp = new node(data);
        if(head == null)
        {
            head = temp;
            tail = head;
            size++;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
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
        doublyLLhead s = new doublyLLhead();
        s.addhead(10);
        s.addhead(50);
        s.addhead(77);
        s.print();
    }
}
