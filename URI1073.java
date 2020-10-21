import java.util.Scanner;

    public class URI1073{
        public static void main (String args[]){
            Scanner teclado =  new Scanner(System.in);

            int iNum;
            iNum =  teclado.nextInt();

            
            for (int ct=2; ct<=iNum ; ct++){
                if ( ct % 2 == 0 ){                    
                    System.out.println(ct+"^2 = "+(ct*ct));
                }
            }

        }
    }