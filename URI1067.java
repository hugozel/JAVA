import java.util.Scanner;

    public class URI1067{
        public static void main (String args[]){
            Scanner teclado = new Scanner (System.in);

        int iNum;
        int iCtt=0;
        iNum = teclado.nextInt();


        for (iCtt=1; iCtt<=iNum; iCtt++){
            if (iCtt % 2 != 0){
              System.out.println(iCtt);
            }
        }
        
        }
    }

