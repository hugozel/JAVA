import java.util.Scanner;

public  class URI1052{
        public static void main(String  args[]){
            Scanner teclado = new Scanner(System.in);
            
            int iMes;
            String sMes="";
            
            iMes = teclado.nextInt();
            

            if ( iMes == 1){
                sMes = "January";
            }
            else if ( iMes == 2){
                sMes = "February";
            }
             else if ( iMes == 3){
                sMes = "March";
            }
             else if ( iMes == 4){
                sMes = "April";
            }
             else if ( iMes == 5){
                sMes = "May";
            }
             else if ( iMes == 6){
                sMes = "June";
            }
             else if ( iMes == 7){
                sMes = "July";
            }
             else if ( iMes == 8){
                sMes = "August";
            }
             else if ( iMes == 9){
                sMes = "September";
            }
             else if ( iMes == 10){
                sMes = "October";
            }
               else if ( iMes == 11){
                sMes = "November";
            }
              else if ( iMes == 12){
                sMes = "December";
            }
           
          System.out.println(sMes);

        }
}