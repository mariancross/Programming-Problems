/**
  * Problem: 156 - Ananagrams
  * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=92
  */

import java.io.*;
import java.util.*;

public class Ananagrams
{
	static BufferedReader input;

	static String leer() throws IOException
	{
		return input.readLine();
	}

	static String ordenar(String cadena)
	{
		char[] letras = cadena.toLowerCase().toCharArray();
		Arrays.sort(letras);

		return new String(letras);
	}

	public static void main(String[] args) throws IOException
	{
		input = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		HashSet<String> originales = new HashSet<String>();
		HashSet<String> diccionario = new HashSet<String>();
		HashSet<String> repetidas = new HashSet<String>();

		TreeSet<String> ananagrams = new TreeSet<String>();

		while(true)
		{
			String palabra = leer();

			if(palabra.equals("#")) break;

			StringTokenizer tk = new StringTokenizer(palabra," ");

			while(tk.hasMoreTokens())
			{
				palabra = tk.nextToken();

				originales.add(palabra);
				palabra = ordenar(palabra);

				if(diccionario.contains(palabra)) repetidas.add(palabra);
				else diccionario.add(palabra);
			}
		}

		for(String s:originales)
		{
			String palabra=s;
			palabra = ordenar(palabra);

			if(!repetidas.contains(palabra)) ananagrams.add(s);
		}

		for(String s:ananagrams)
		{
			output.println(s);
		}

		output.close();
	}
}
