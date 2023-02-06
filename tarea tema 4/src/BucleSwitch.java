import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class BucleSwitch {
    public static void main (String [] args) {
        System.out.println("Por favor, escriba una estacion del año ");
        String estacion;
        Scanner Keyboard = new Scanner(System.in);
        estacion = Keyboard.next();
        switch(estacion){
            case "Primavera":
                System.out.println("es Primavera");
                break;
            case "Verano":
                System.out.println("es Verano");
                break;
            case "Otoño":
                System.out.println("es Otoño");
                break;
            case "Invierno":
                System.out.println("es Invierno");
                break;
            default:
                System.out.println("por favor introduzca una estacion valida");
        }
    }
}
