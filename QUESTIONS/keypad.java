public class keypad {
    private static void combination(String dig,String res,String a[])
    {
       if(dig.length()==0)
        {
           System.out.print(res+" ");
           return;
        }
        int curr_no = dig.charAt(0)-'0';
        String rem = a[curr_no];
        for(int i=0;i<rem.length();i++)
          combination(dig.substring(1), res+rem.charAt(i), a);
    }
    public static void main(String[] args) {
       String s= "2";
       String store[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       combination(s,"",store);
    }
}
