public class stackArray {
    private int front=0;
    private int rear=0;
    private int size=0;
    private int a[];
    private stackArray(int x)
    {
        a = new int[x];
    }
    private void push(int data)
    {
       if(rear == a.length)
       {
        System.out.println("Stack is Full "+data);
        return;
       }
       if(size == 0)
       {
        a[front] = data;
        rear++;
        size++;
        return;
       }
       a[rear] = data;
       rear++;
       size++;
    }
    private int getmesize()
    {
       return size;
    }
    private int getmefront()
    {
        return a[front];
    }
    private void print()
    {
        for(int i=0;i<a.length;i++)
        if(a[i]>0)
              System.out.print(a[i]+" ");
        System.out.println();    
    }
    private void pop()
    {
        if(rear == 0)
        {
            System.out.println("Stack is Empty");
            return;
        }
        rear--;
        a[rear] = Integer.MIN_VALUE;
        rear--;
        size--;
    }
    public static void main(String[] args) {
        stackArray s = new stackArray(5);
        s.push(50);
        s.push(55);
        s.push(40);
        s.push(80);
        s.push(10);
        s.print();
        s.pop();
        s.print();
        System.out.println("size of stack "+s.getmesize());
        System.out.println("Top of stack "+s.getmefront());
    } 
}
