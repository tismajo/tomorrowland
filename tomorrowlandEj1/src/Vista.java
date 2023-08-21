import java.util.Scanner;

public class Vista {
    // nuevo objeto controlador
    Controlador controlador = new Controlador();
    Scanner scan = new Scanner(System.in);

    public void ingresoDatos(){
        // Mostrar mensaje de bienvenida y permitir el ingreso de datos
        scan =  new Scanner(System.in);
        String nombre = scan.nextLine();
        String dpi = scan.nextLine();
        int cantidadBoletos = scan.nextInt();
        Float presupuestoMax = scan.nextFloat();
        controlador.colocarDatos(nombre, dpi, cantidadBoletos, presupuestoMax);
    }

    public void mostrarEsApto(){
        // Determinar si el usuario es apto para comprar o no, demostrarle por qu;é si o no es apto al mostrar los n;úmeros y la suma
        System.out.println("Le tocó el ticket: " + controlador.numeroTicket + " número random 1: " + controlador.numeroAleatorioA + " número random 2: " + controlador.numeroAleatorioB + " y la suma sería: " + controlador.sumarTickets());
        controlador.aptoParaCompra();
    }
}
