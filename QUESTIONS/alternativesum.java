import java.util.Scanner;
public class alternativesum {
    private static int getsum(int x)
    {
        if(x==1)
          return 1;
        if(x%2 == 0)
            return getsum(x-1)-x;
         return getsum(x-1)+x;
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(getsum(x));
    }
}
