public class queueLL {
    node front;
    node rear;
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
    private void enqueue(int data)
    {
        node temp = new node(data);
        if(front == null)
        {
           front = temp;
           rear = temp;
           size++;
           return;
        }
        rear.next = temp;
        rear = temp;
        size++;
    }
    private void print()
    {
        node temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    private void dequeue()
    {
       if(size == 0)
       {
        System.out.println("Queue is Empty");
        front = rear = null;
        return;
       }
       front = front.next;
       size--;
    }
    private int getmesize()
    {
        return size;
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.enqueue(50);
        q.enqueue(55);
        q.enqueue(40);
        q.print();
        System.out.println(q.getmesize());
        q.dequeue();
        q.print();
     }
}
