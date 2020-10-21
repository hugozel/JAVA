import java.util.Scanner;

public  class URI1046{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
             int iH1, iH2;
             int iTempo=0;
                                       
            iH1 = teclado.nextInt();
            iH2 = teclado.nextInt();
             
            
            if ( iH1 == iH2) {
                System.out.println("O JOGO DUROU 24 HORA(S)");                
            }
            else if ( iH1 > iH2) {
                iTempo = (24-(iH1 - iH2));
                System.out.printf("O JOGO DUROU %d HORA(S)\n", iTempo);                
            }
            else {
                iTempo = (iH2 - iH1);
                System.out.printf("O JOGO DUROU %d HORA(S)\n", iTempo);                
            }            
        }
}