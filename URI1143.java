import java.util.Scanner;

     public class URI1143{
         public static void main (String args[]){
             Scanner teclado = new Scanner(System.in);

             int iNum;           
             iNum = teclado.nextInt();               
            
            for (int cnt=1; cnt<=iNum; cnt++) {
               
                 System.out.println(cnt + " " + (cnt*cnt) + " " + (cnt*cnt*cnt) );

                 }   
            }        

         }
