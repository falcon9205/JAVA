public class recursion {
    private static void reverse(int x)
    {  
        if(x>7)
          return;
        System.out.println(x);  
        reverse(x+1);  
        
    }
    public static void main(String[] args) {
        int n = 7;
        reverse(1);
    }
}
