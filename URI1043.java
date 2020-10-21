import java.util.Scanner;

public  class URI1043{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
            float fA;
            float fB;
            float fC;

            float fSpace=0;
            
            fA = teclado.nextFloat();
            fB = teclado.nextFloat();
            fC = teclado.nextFloat();

            if ( ((fA + fB) > fC) && ((fB + fC) > fA) && ((fA + fC) > fB)) {
                fSpace = fA+fB+fC;
                System.out.println("Perimetro = " + fSpace);
            }
            else {
                fSpace = ((fA+fB)*fC)/2;
                System.out.println("Area = " + fSpace);
            }
            
        }
}