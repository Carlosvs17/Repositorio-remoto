import java.util.Scanner;

//El proyecto plantea un juego: adivinar el número que genera de manera aleatoria el programa.

public class Aciertos {
	//Primero se genera el número aleatorio
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
        	//a continuación se pide al usuario que introduzca un número entero
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            //Si el valor es menor o mayor del número generado, se proporciona un texto orientativo y continua esperando un nuevo número.
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        //En caso de acierto se anuncia el éxito, y la aplicación finaliza.
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
