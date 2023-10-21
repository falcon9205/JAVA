public class stackLL {
    node front;
    node rear;
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
    private void push(int data)
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
    private void pop()
    {
        if(front == rear)
        {
            System.out.println("Stack is empty");
            front = rear = null;
            return;
        }
        size--;
        node temp = front;
        while(temp.next!=rear)
           temp = temp.next;
        temp.next = null;
        rear = temp;   
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
    public static void main(String[] args) {
        stackLL s = new stackLL();
        s.push(50);
        s.push(10);
        s.push(55);
        s.print();
        s.pop();
        s.pop();
        s.print();
    }
}
