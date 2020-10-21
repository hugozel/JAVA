import java.util.Scanner;

public  class URI1038{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
            int codigo, qtd;
            float total = 0;

            codigo = teclado.nextInt();
            qtd = teclado.nextInt();

            if ( codigo == 1){
                total = qtd * 4.00f;             
            }
            else if ( codigo == 2){
                total = qtd * 4.50f;         
            }
            else if ( codigo == 3){
                total = qtd * 5.00f;         
            }
            else if ( codigo == 4){
                total = qtd * 2.00f;         
            }    
            else if ( codigo == 5){
                total = qtd * 1.50f;         
            }    

            System.out.printf("Total: R$ %.2f\n", total);
        }
}