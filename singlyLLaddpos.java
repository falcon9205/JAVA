public class singlyLLaddpos {
    node head;
    node tail;
    int size=0;
    private class node{
        int data;
        node next;
        node (int x)
        {
            this.data = x;
            this.next = null;
        }
    }
    private void addtail(int x)
    {
        node temp = new node(x);
        if(head == null)
        {
            head = temp;
            tail = head;
            return;
        }
        tail.next = temp;
        tail = temp;
    }
    private void addhead(int x)
    {
        node temp = new node(x);
        if(head == null)
        {
            head = temp;
            tail = head;
            return;
        }
        temp.next = head;
        head = temp;
    }
    private void addposition(int index,int element)
    {
        if(index == 0)
        {
            size++;
            addhead(element);
            return;
        }
        if(index == size)
        {
            size++;
            addtail(element);
            return;
        }
        node temp = head;
        for(int i=1;i<index;i++)
             temp = temp.next;
        node newnode = new node(element);
         newnode.next = temp.next;
         temp.next = newnode;  
    }
    private void print(){
        node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        } while(temp!=null);
        System.out.println();
    }
    public static void main(String[] args) {
        singlyLLaddpos s  = new singlyLLaddpos();
        s.addposition(0, 50);
        s.addposition(0,5);
        s.addposition(2,4);    // 1 based indexing for size
        s.addposition(0,10);
        s.print();
    }
}
