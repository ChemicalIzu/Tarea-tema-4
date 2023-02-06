import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroif;
        Scanner Keyboard = new Scanner(System.in);
        numeroif = Keyboard.nextInt();
        if (numeroif > 0){
            System.out.println("el numero es mayor que cero");
        }else if (numeroif == 0){
            System.out.println("el numero es 0");
        }else{
            System.out.println("el numero es menor que cero");
        }
    }
}