import java.util.Scanner;

public  class URI1050{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
            int iDDD;
            String sCidade;
            
            iDDD = teclado.nextInt();
            

            if ( iDDD == 61){
                sCidade = "Brasilia";
            }
            else if ( iDDD == 71){
                sCidade = "Salvador";
            }
            else if ( iDDD == 11){
                sCidade = "Sao Paulo";
            }
            else if ( iDDD == 21){
                sCidade = "Rio de Janeiro";                
            }
            else if ( iDDD == 32){
                sCidade = "Juiz de Fora";
            }
            else if ( iDDD == 19){
                sCidade = "Campinas";
            }
            else if ( iDDD == 27){
                sCidade = "Vitoria";
            }
            else if ( iDDD == 31){
                sCidade = "Belo Horizonte";
            }
            else {
                sCidade = "DDD nao cadastrado";
            }

          System.out.println(sCidade);

        }
}