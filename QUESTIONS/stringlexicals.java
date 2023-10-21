public class stringlexicals {
    private static void sortlexical(String s[])
    {
        for(int i=0;i<s.length;i++)
        {
           int min = i;
           for(int j=i+1;j<s.length;j++)
              if(s[j].compareTo(s[min])<0)
                min = j;
           String temp = s[i];
           s[i] = s[min];
           s[min] = temp;     

        }
    }
     public static void main(String[] args) {
        String str[] = {"papaya","lime","watermelon","apple"};
        for(String x : str)
           System.out.print(x+" ");
        sortlexical(str);
        System.out.println();
        for(String x : str)
           System.out.print(x+" ");
     }
}
