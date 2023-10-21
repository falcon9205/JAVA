public class doublyLLdelete {
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
    private void deletehead()
    {
        head = head.next;
        head.prev = null;
    }
    private void deletetail()
    {
        node temp = head;
        while(temp.next!=tail)
          temp = temp.next;
        temp.next = null;
        tail = temp;      
    }
    private void deleteatpos(int index)
    {
        if(index == 1)
        {
            deletehead();
            size--;
            return;
        }
        if(index == size)
        {
            deletetail();
            size--;
            return;
        }
        node prev = head;
        node next = head;
        for(int i=1;i<index;i++)
        {   

            next = next.next;
        }
        prev.next = next.next;
        next = next.next;
        next.prev = prev;
    }
    private int getmesize()
    {
        return size;
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
        doublyLLdelete s = new doublyLLdelete();
        s.addhead(10);
        s.addhead(50);
        s.addhead(77);
        s.print();
        System.out.println(s.getmesize());
        s.deleteatpos(2);
        s.print();
    }
}
