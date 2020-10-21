import java.util.Scanner;

    public class URI1114{
        public static void main (String args[]){
            Scanner teclado =  new Scanner(System.in);
        
        
           int iSenha;
            boolean bCheck=false;

            while (bCheck == false){
                iSenha = teclado.nextInt();

                if (iSenha == 2002){
                    System.out.println("Acesso Permitido");
                    bCheck = true;
                }
                else {
                 System.out.println("Senha Invalida");
                }         
            }
        }
    }