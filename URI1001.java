import java.util.Scanner;


public class URI1001{
    public static void main(String args[]){
        int a,b,soma;
        Scanner teclado=new Scanner(System.in);
        //Entrada de dados
        a=teclado.nextInt();
        b=teclado.nextInt();

        //Processamento
        soma=a+b;

        //Saída
        System.out.println("X = "+soma);
        
        
    }
}