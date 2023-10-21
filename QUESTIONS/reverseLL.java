public class reverseLL {
        node head;
        node tail;
        int size = 0;
        public class node{
            int data;
            node next;
            node(int data)
            {
                this.data = data;
            }
        }
        private void addhead(int data)
        {
            node temp = new node(data);
            if(head==null)
             {
                head = temp;
                tail = head;
                size++;
                return;
             }
             temp.next = head;
             head = temp;
             size++;
        }
        private void printlist()
        {
            node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            } System.out.println();
        }
        private void reverselist()
        {
           head  = recursionreverse(head);
            // node curr = head;
            // node prev = null;
            // while(curr!=null)
            // {
            //    node temp = curr.next;
            //    curr.next = prev;
            //    prev = curr;
            //    curr = temp;
            // }  
            //  head = prev;
        }
        private  node recursionreverse(node head)
        {
             if(head==null || head.next==null)
               return head;
             node newhead = recursionreverse(head.next);
             node headnext = head.next;
             headnext.next = head;
             head.next = null;
             return newhead;
        }
        public static void main(String[] args) {
            reverseLL list = new reverseLL();
            list.addhead(5);
            list.addhead(14);
            list.addhead(13);
            list.addhead(50);
            list.addhead(15);
            list.addhead(12);
            list.printlist();
            list.reverselist();
            list.printlist();
        }
    }

