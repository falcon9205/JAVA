public class singlyLLtail {
    node head;
    node tail;
    private class node{
        int data;
        node next;
        node(int x)
         {
            this.data = x;
            this.next = null;
         }
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
    public static void main(String[] args) {
        singlyLLtail s = new singlyLLtail();
        s.addtail(5);
        s.addtail(6);
        s.addtail(70);
        s.print();
    }
}
