import java.util.Scanner;

public  class URI1037{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
            double iVal;
            String sRange="";
            
            iVal = teclado.nextDouble();
            

            if ( iVal >= 0 &&  iVal <= 25){
                sRange = "Intervalo [0,25]";
            }
            else if ( iVal > 25 &&  iVal <= 50){
                sRange = "Intervalo (25,50]";
            }
            else if ( iVal > 50 &&  iVal <= 75){
                sRange = "Intervalo (50,75]";
            }
            else if ( iVal > 75 &&  iVal <= 100){
                sRange = "Intervalo (75,100]";
            }
            else {
                sRange = "Fora de intervalo";
            }
           
           
          System.out.println(sRange);

        }
}