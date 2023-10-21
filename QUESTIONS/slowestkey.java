import java.util.*;
public class slowestkey {
  private static char slowestkey(int releaseTimes[],String keysPressed)
  {  char ch='a';
    int n = releaseTimes.length;
    Integer timearray[] = new Integer[n];
    for(int i=0;i<n;i++)
     {
      if(i==0)
      {
        timearray[i]=releaseTimes[i];
        continue;
      }
      timearray[i] = releaseTimes[i]-releaseTimes[i-1]; 
     }
     int max = Collections.max(Arrays.asList(timearray));
     for(int i=0;i<n;i++)
     {
      if(max == timearray[i])
      {
       char temp = keysPressed.charAt(i);
       if(ch < temp)
         ch  = temp;
      }
     }
     return ch;
  }
   public static void main(String[] args) {
    int r [] ={9,29,49,50};
    String s = "cbcd";
    System.out.println(slowestkey(r, s));
   }
}
