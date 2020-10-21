import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

    public class URI1115{
        public static void main (String args[]){
            Scanner  teclado =  new Scanner(System.in);


            int x=1;
            int y=1;
                        
            while (x !=0 && y!=0 ){
                x = teclado.nextInt();
                y = teclado.nextInt();

                if (x>0 && y>0){
                    System.out.println("primeiro");
                }
                else if (x>0 && y<0){
                    System.out.println("quarto");
                }
                else if (x<0 && y>0){
                    System.out.println("segundo");
                }
                if (x<0 && y<0){
                    System.out.println("terceiro");
                }
            }
            
            }

        }    
