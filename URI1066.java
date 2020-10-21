import java.util.Scanner;

    public class URI1066{
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);

            int iNum=0;
            int iqtdPares=0;
            int iqtdImpares=0;
            int iqtdNegativos=0;
            int iqtdPositivos=0;

            for (int cnt=1; cnt<=5; cnt++){
               iNum = teclado.nextInt();

               if (iNum > 0 ) {
                    iqtdPositivos++;
               }
                else if (iNum < 0 ) {
                    iqtdNegativos++;                                       
               }

               if (iNum % 2 == 0 ) {
                    iqtdPares++;
               }
                else{
                    iqtdImpares++;                                       
               }
             
            }
               System.out.println(iqtdPares+" valor(es) par(es)");
               System.out.println(iqtdImpares+" valor(es) impar(es)");
               System.out.println(iqtdPositivos+" valor(es) positivo(s)");
               System.out.println(iqtdNegativos+" valor(es) negativo(s)");


        }

    }
