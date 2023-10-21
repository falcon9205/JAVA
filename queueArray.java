public class queueArray {
    private int a[];
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    private queueArray(int c)
    {
        a = new int[c];
    }
    private void enqueue(int data)
    {
        if(size == a.length)
        {
            System.out.println("Queue is Full while adding "+data);
            return;
        }
        if(size == 0)
        {
            a[front]=data;
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
    private void print()
    {
        for(int i=0;i<a.length;i++)
           if(a[i]>0)
             System.out.print(a[i]+ " ");
        System.out.println();   
    }
    private void dequeue()
    {
        if(size == 0)
         {
            System.out.println("Queue is Empty");
            return;
         }
         a[front] = Integer.MIN_VALUE;
         front++;
         size--;
    }
    public static void main(String[] args) {
        queueArray s = new queueArray(5);
        s.enqueue(50);
        s.enqueue(40);
        s.enqueue(20);
        s.enqueue(10);
        s.enqueue(33);
        s.print();
        s.enqueue(90);
        s.print();
        s.dequeue();
        s.print();
        System.out.println("The size of queue is "+s.getmesize());

    }
}
