public class singlyLLhead {
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
    public static void main(String[] args) {
        singlyLLhead s = new singlyLLhead();
        s.addhead(5);
        s.addhead(6);
        s.addhead(70);
        s.print();
    }
}
