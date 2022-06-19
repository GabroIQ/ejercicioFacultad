import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcionSolicitada;
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Calcularemos el area de: ");
        mostrarMensaje("1) Circulo ");
        mostrarMensaje("2) Triangulo ");
        mostrarMensaje("3) Cuadrado ");
        mostrarMensaje("Elija la opcion deseada: ");
        
        opcionSolicitada = scanner.nextInt();

        while (opcionSolicitada < 1 || opcionSolicitada > 3) {
            mostrarMensaje("Opcion incorrecta, vuelva a intriducir: ");
            opcionSolicitada = scanner.nextInt();
        }
        switch (opcionSolicitada) {
            case 1:
                mostrarMensajeNum(mostrarAreaCirculo());
                break;

                case 2:
                
                break;

                case 3:
                
                break;
        
            default:
                break;
        }
    }

    //OPCION DE NUMERO
    public static float mostrarAreaCirculo() {
        int radio;
        float resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = scanner.nextInt();
        resultado = (float) ((radio/2)*3.14); 
        return resultado;
    }

    public static Void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
        return null;
    }

    public static Float mostrarMensajeNum(Float mensaje) {
        System.out.println(mensaje);
        return null;
    }
}
