import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        int a, b, c, r;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tienes que introducir 3 numeros, introduce el primero (a):");
        a = scanner.nextInt();
        System.out.println("introduce el segundo (b):");
        b = scanner.nextInt();
        System.out.println("introduce el tercero (c):");
        c = scanner.nextInt();

        System.out.println("primera operacion: a * b + c * ((3-a) * (2 * b) ");
          r = a * b + c * ((3-a) * 2 * b);
        System.out.println("Resultado = " + r );

        System.out.println("segunda primera operacion: ((2 + a * b) / 4) c + 2 ");
        r = ((2 + a * b) / 4) ^(c + 2);
        System.out.println("Resultado = " + r );



    }
}