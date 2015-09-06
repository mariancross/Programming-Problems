/**
  * Problem: 119 - Greedy Gift Givers
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=55
  */

import java.io.*;

public class GreedyGiftGivers 
{
  private String[] nombres;
  private int[] money;

  public void leerDatos() throws IOException 
  {
    int it = 0;

    String cadena="";
    BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

    while(true)
    {
      cadena = buffer.readLine();

      if(cadena == null) break;

      if(it != 0) System.out.println();

      nombres = buffer.readLine().split(" ");
      money = new int[nombres.length];

      for(int i = 0; i < nombres.length; i++)
      {
        String[] datos = buffer.readLine().split(" ");

        int id = idPersona(datos[0]);
        int dinero = Integer.parseInt(datos[1]);
        int cantidad = Integer.parseInt(datos[2]);

        if(cantidad != 0)
        {
          int neto = (int)(dinero / cantidad);

          for(int j = 3; j < datos.length; j++)
          {
            int idx = idPersona(datos[j]);
            money[idx] += neto;
            money[id] -= neto;
          }
        }
      }

      for(int i = 0; i < nombres.length; i++)
      {
        System.out.println(nombres[i] + " " + money[i]);
      }

      it++;
    }
  }

  public int idPersona(String name)
  {
    for(int i = 0; i < nombres.length; i++)
    {
      if(nombres[i].equals(name)) 
      {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) throws IOException
  {
    GreedyGiftGivers ggg = new GreedyGiftGivers();
    ggg.leerDatos();
  }
}
