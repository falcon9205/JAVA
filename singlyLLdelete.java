public class singlyLLdelete {
    node head;
    node tail;
    int size = 0;
    private class node{
        int data;
        node next;
        node(int x)
         {
            this.data = x;
            this.next = null;
         }
    }
    private void deletetail()
    {
        node temp = head;
        while(temp.next!=tail)
          temp = temp.next;
        temp.next = null;
        tail = temp;  
    }
    private void deletehead()
    {
        head = head.next;
    }
    private void deleteatpos(int index)
    {
       if(head == null)
          {
            System.out.println("Already Empty ");
            size = 0;
            return;
          }
        if(index == 0) 
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
        node newnode = null;
        for(int i=1;i<index;i++)
        {
            temp  = temp.next;
        }
        newnode = temp.next.next;
        temp.next = newnode;

        
    }
    private void print()
    {
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        } 
        System.out.println();
    }
    private void addhead(int x)
    {
        node temp = new node(x);
        if(head == null)
        {
            size++;
            head = temp;
            tail = head;
            return;
        }
        size++;
        temp.next = head;
        head = temp;
    }
    public static void main(String[] args) {
        singlyLLdelete s = new singlyLLdelete();
        s.addhead(5);
        s.addhead(6);
        s.addhead(70);
        s.deleteatpos(1);   // 0 based deleting indexing
        s.print();
    }
}
