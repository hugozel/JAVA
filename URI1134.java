import java.util.Scanner;

     public class URI1134{
         public static void main (String args[]){
             Scanner teclado = new Scanner(System.in);

             int iTipo;
             int qtAlcool=0;
             int qtGasolina=0;
             int qtDiesel=0;
             
            
            do {
               iTipo = teclado.nextInt();
                if (iTipo == 1){
                    qtAlcool++;
                }
                else if (iTipo == 2){
                    qtGasolina++;
                }
                else if (iTipo == 3){
                    qtDiesel++;
                }     
            } while (iTipo != 4);


           
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + qtAlcool);
            System.out.println("Gasolina: " + qtGasolina);
            System.out.println("Diesel: " + qtDiesel);

         }
     }