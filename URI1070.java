import java.util.Scanner;

    public class URI1070{
        public static void main (String args[]){
            Scanner teclado =  new Scanner(System.in);

            int iNum;
            iNum =  teclado.nextInt();

            int iMax=0;

            for (int ct=iNum+1; iMax <6 ; ct++){
                if ( ct % 2 != 0 ){
                    iMax++;
                    System.out.println(ct);
                }
            }

        }
    }