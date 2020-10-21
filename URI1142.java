import java.util.Scanner;

     public class URI1142{
         public static void main (String args[]){
             Scanner teclado = new Scanner(System.in);

             int iNum;           
             iNum = teclado.nextInt();               
            
            for (int cnt=1; cnt<=(4 * iNum); cnt++) {

                if (cnt % 4 != 0){
                    System.out.print(cnt + " ");        
                }
                else {
                    System.out.println("PUM");        
                }
            }        

         }
     }