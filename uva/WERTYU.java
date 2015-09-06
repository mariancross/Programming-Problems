/**
  * 10082 - WERTYU
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1023
  */

import java.io.*;

public class WERTYU
{
  private String[] datos;

  public WERTYU() 
  {
    datos = new String[] {"`","1","2","3","4","5","6","7","8","9","0","-","=","",
    "Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","\\",
    "A","S","D","F","G","H","J","K","L",";","'","Enter",
    "Z","X","C","V","B","N","M",",",".","/"};
  }

  public void leerDatos() throws IOException
  {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String cadena = "";

    while(true)
    {
      cadena = buffer.readLine();

      if(cadena == null) break;

      procesar(cadena);
    }    
  }

  public void procesar(String cadena)
  {
    String resultado = "";
    Character c;
    String caracter = "";

    for(int i = 0; i < cadena.length(); i++)
    {
      c = new Character(cadena.charAt(i));
      caracter = c.toString();

      if(caracter.equals(" "))
      {
        resultado += " ";
      }
      else
      {
        for(int j = 0; j < datos.length; j++)
        {
          if(datos[j].equals(caracter))
          {
            resultado += datos[j - 1];
            break;
          }
        }
      }
    }

    System.out.println(resultado);
  }

  public static void main(String[] args) throws IOException
  {
    WERTYU wertyu = new WERTYU();
    wertyu.leerDatos();
  }
}
