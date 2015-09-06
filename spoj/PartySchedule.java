/**
  * Problem: PARTY - Party Schedule
  * URL: http://www.spoj.com/problems/PARTY/
  */

import java.io.*;
import java.util.*;

public class PartySchedule {
	static int partyBudget;
	static int numParties;

	static BufferedReader input;
	static PrintWriter output;

	static StringTokenizer tk;

	static int data[][];

	static int matrix[][];

	static String read() throws IOException {
		String line = input.readLine();

		if( line != null) tk = new StringTokenizer(line, " ");

		return line;
	}

	static String next() {
		return tk.nextToken();
	}

	static int nextInt() {
		return Integer.parseInt( next() );
	}

	public static void main(String[] args) throws IOException {
		input = new BufferedReader(new InputStreamReader(System.in));
		output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		while( true ) {
			String line = read();

			if(line.equals("0 0")) break;

			partyBudget = nextInt();
			numParties = nextInt();

			matrix = new int[ partyBudget + 1 ] [ numParties + 1 ];

			data = new int[numParties][2];

			for( int i = 0 ; i < numParties ; i++ ) {
				read();

				data[i][0] = nextInt();
				data[i][1] = nextInt();
			}

			for( int i = 1 ; i <= partyBudget ; i++ ) {
				for( int j = 1 ;  j <= numParties ; j++ ) {
					if( i >= data[j-1][0] )
						matrix[i][j] = Math.max( data[j-1][1] + matrix[i - data[j-1][0]][j-1], matrix[i][j-1] );
					else
						matrix[i][j] = matrix[i][j-1];
				}
			}

			int fun = -1;
			int money = -1;

			for(int i = 0 ; i <= partyBudget ; i++ ) {
				if(matrix[i][numParties] > fun) {
					fun = matrix[i][numParties] ;
					money = i;
				}
			}

			output.println(money + " " + fun);

			read();
		}

		output.close();
	}
}
