import java.util.Scanner;

public  class URI1047{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
             int iH1,iH2,iM1,iM2;
             double dHoras=0;
             double dMinutes=0;
                                                            
            iH1 = teclado.nextInt();
            iH2 = teclado.nextInt();
            iM1 = teclado.nextInt();
            iM2 = teclado.nextInt();

            iH1=(iH1*60);
            iH2=(iH2*60);
            
            iH1=iH1+iM1;
            iH2=iH2+iM2;
            
            if ( (iH1+iM1) == (iH2+iM2) {
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");                
            }
            else if ( iH1 > iH2) {
                iHoras = (int)(2460-(iH1 - iH2)) / 60);
                iMinutes = Math.ceil((((2460-(iH1 - iH2)) / 60) - iHoras)*60));
                System.out.printf("O JOGO DUROU %d HORA(S)\n", iTempo);                
            }
            else {
                iHoras = (int)((iH2 - iH1) / 60);
                iMinutes = Math.ceil((((iH2 - iH1) / 60) - iHoras)*60);
                System.out.println("O JOGO DUROU" + iHoras + "HORA(S) E" + iMinutes + " MINUTO(S)");                
            }            
        }
}