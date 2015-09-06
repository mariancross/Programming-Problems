/**
  * 10935 - Throwing cards away I
  * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1876
  */
  
import java.io.*;
import java.util.*;

public class ThrowingCardsAway {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    while( true ) {
      int n = Integer.parseInt(input.readLine());

      if(n == 0) break;

      LinkedList<Integer> list = new LinkedList<Integer>();
      ArrayList<Integer> discarded = new ArrayList<Integer>();

      for(int i = 1; i <= n; i++) {
        list.add(i);
      }

      while(list.size() > 1) {
        discarded.add(list.poll());
        list.add(list.poll());
      }

      output.print("Discarded cards:");

      if(n != 1) output.print(" ");

      for(int i = 0; i < discarded.size(); i++) {
      output.print(discarded.get(i));

      if(i < discarded.size() - 1) 
        output.print(", ");
      }

      output.println("\nRemaining card: " + list.get(0));
    }

    output.close();
  }
}
