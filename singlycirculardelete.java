public class singlycirculardelete {
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
    private void deletehead()
    {
        size--;
        head = head.next;
        tail.next = head;

    }
    private void deletetail()
    {
        node temp = head;
        while(temp!=tail)
        {
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
        size--;
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
         node temp = head;
         for(int i=1;i<index-1;i++)
         {
            temp = temp.next;
         }
         size--;
         temp.next = temp.next.next;

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
    public static void main(String[] args) {
        singlycirculardelete s = new singlycirculardelete();
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
         s.deleteatpos(2);
         s.print();
    }
}
