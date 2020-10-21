import java.util.Scanner;

public  class URI1041{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
            float fX;
            float fY;

            String sQuadrante="";
            
            fX = teclado.nextFloat();
            fY = teclado.nextFloat();

            if ( fX == 0 &&  fY != 0){
                sQuadrante = "Eixo Y";
            }
            else if ( fX != 0 &&  fY == 0){
                sQuadrante = "Eixo X";
            }
            else if ( fX == 0 &&  fY == 0){
                sQuadrante = "Origem";
            }
            else if (fX >= 0 && fY >= 0){
                sQuadrante = "Q1";
            }
            else if (fX < 0 && fY >= 0){
                sQuadrante = "Q2";
            }
            else if (fX < 0 && fY < 0){
                sQuadrante = "Q3";
            }
            else if (fX >= 0 && fY < 0){
                sQuadrante = "Q4";
            }

            System.out.println(sQuadrante);
        }
}