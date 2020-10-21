import java.util.Scanner;

    public class URI1064{
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);

            float fNum;
            int iqtdPositivos=0;

            float media, soma;
            
            soma=0; //soma incialemter vale 0

            for (int cont=1; cont<=6; cont++){
                fNum = teclado.nextFloat ();
                if (fNum > 0){
                    iqtdPositivos++;
                    soma=soma+fNum;                    
                }
            } 
            media=soma/iqtdPositivos;
            System.out.println(iqtdPositivos+"valores positivos");
             System.out.println(media);
            
        }
    }