import java.util.*;

import javax.print.DocFlavor.STRING;

public class temp {
  public static void solve(int n, String out, int open, int close, List<String> ans) {
    if (open == 0 && close == 0) {
      ans.add(out);
      return;
    }
    String op1 = out;
    String op2 = out;
    if (open != 0) {
      op1 += '(' + "";
      solve(n, op1, open - 1, close, ans);
    }
    if (open < close) {
      op2 += ")" + "";
      solve(n, op2, open, close - 1, ans);
    }
    // } else if (open == close) {
    // op1 += '(' + "";
    // op2 += '(' + "";
    // solve(n, op1, open - 1, close);
    // } else {
    // op1 += ')' + "";
    // op2 += ')' + "";
    // solve(n, op1, open, close - 1);
    // }
    return;

  }

  public static void main(String[] args) {
    int n = 1;

    String out = '(' + "";
    List<String> ans = new ArrayList<String>();
    solve(n, out, n - 1, n, ans);
    System.out.println(ans);
  }
}