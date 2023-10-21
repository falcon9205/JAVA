public class doublyLLaddpos {
    node head;
    node tail;
    int size =0;
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
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }
    private void addhead(int data)
    {
        node temp = new node(data);
        if(head == null)
        {
            head = temp;
            tail = head;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
    }
   private void addpos(int index, int element)
   {
     if(index == 1)
      {
        addhead(element);
        size++;
        return;
      }
      if(size == index)
      {
        addtail(element);
        size++;
        return;
      }
      node temp = head;
      for(int i=1;i<index;i++)
      {
        temp  = temp.next;
      }
      if ( size<index)
      {
        System.out.println("Empty list");
        return;
      }
      node temp1= temp.next;
      node newnode = new node(element);
      temp.next = newnode;
      newnode.next = temp1;
   }
   private void print(){
    node temp = head;
    while(temp!= null)
    {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
   }
   private int getmesize()
   {
    return size;
   }
   public static void main(String[] args) {
    doublyLLaddpos s = new doublyLLaddpos();
    s.addpos(0, 10);
    s.addpos(1, 77);
    System.out.println(s.getmesize());
    s.addpos(2, 2);
    s.addpos(2, 88); // 1 based indexing for size and adding data
    s.print();
   }
}
