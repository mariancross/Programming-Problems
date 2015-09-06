/**
  * 10924 - Prime Words
  * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1865
  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeWords {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      String line = input.readLine();

      if(line == null) break;

      int value = 0;
      boolean op = false;		

      for(int i = 0; i < line.length(); i++) {
        char letter = line.charAt(i);

        if(Character.isLowerCase(letter)) 
          value += letter - 'a' + 1;
        else
          value += letter - 'a' + 59;				
      }

      for(int i = 2 ; i <= value/2 ; i++ ) {
        if(value % i == 0) {
          System.out.println("It is not a prime word.");
          op = true;
          break;
        }
      }

      if(!op) {
        System.out.println("It is a prime word.");
      }
    }
  }
}
