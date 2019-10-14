package icc.recursion;

    public class Recursion{


/**
*@author Ian García(Chinaski)
*/
/**

*La función realiza una reversa a la lista ingresada
*@param lista -  Lista con datos
*@return fromHearth - Lista con datos en reversa
*
*
*/
      public Lista reversa(Lista lista){



            Recursion r = new Recursion();
            String df=r.aux(lista);
            Lista fromHearth = new Lista(df);
            return fromHearth;



      }
      /**
      *Obtiene los datos provenientes de la lista, los almacena en un StringBuilder y les realiza una reversa
      *@param lista - lista con datos
      *@return sb Stringbuilder convertido a String y en reversa
      *
      *
      */

      public String aux(Lista lista){
        StringBuilder sb = new StringBuilder();
        char mazapan;
      do{
        mazapan= lista.getHead();
        lista=  lista.getTail();
        //aux(lista);
        sb.append(mazapan);
      }while(lista != null);
        return sb.reverse().toString();

      }




      }
