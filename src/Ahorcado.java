import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabra;
        char letra;

        System.out.println("Digite la palabra a adivinar: ");
        palabra = sc.nextLine();

        int intentos = palabra.length();
        char auxiliar[] = new char[palabra.length()];

        // Inicializar el arreglo con guiones
        for (int i = 0; i < palabra.length(); i++) {
            auxiliar[i] = '-';
            System.out.print(auxiliar[i] + " ");
        }
        System.out.println();

        boolean bandera = false;

        while (!bandera && intentos > 0) {
            System.out.println("Digite la letra a adivinar: ");
            letra = sc.nextLine().charAt(0);

            boolean encontrada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    auxiliar[i] = letra;
                    encontrada = true;
                }
            }

            if (encontrada) {
                System.out.println("¡Letra correcta!");
            } else {
                System.out.println("Esa letra no está");
                intentos--;
            }

            System.out.println("Te quedan: " + intentos + " intentos");

            // Mostrar estado actual de la palabra
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print(auxiliar[i] + " ");
            }
            System.out.println();

            // Revisar si se completó la palabra
            bandera = true;
            for (int i = 0; i < palabra.length(); i++) {
                if (auxiliar[i] == '-') {
                    bandera = false;
                    break;
                }
            }
        }
    }


    }

