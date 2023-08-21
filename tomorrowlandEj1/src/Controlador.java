// Importar la librería
import java.util.Random;

public class Controlador {
    // Asignarle valores a las propiedades de los objetos
    Random random = new Random();
    // Generar números aleatorios
    int numeroTicket = random.nextInt(33000)+1;
    int numeroAleatorioA = random.nextInt(15000)+1;
    int numeroAleatorioB = random.nextInt(15000)+1;
    
    // Asignar los números aleatorios
    Ticket ticket = new Ticket(
        numeroTicket, 
        numeroAleatorioA, 
        numeroAleatorioB
        );

    Localidad localidad1 = new Localidad(
        // Lo mismo que se hizo en Ticket pero ahora con Localidad
        "La más alejada del escenario",
        400,
        20
        );
    Localidad localidad5 = new Localidad(
        "En medio y con una mejor vista al escenario", 
        695,
        20
        );
    Localidad localidad10 = new Localidad(
        "Hasta adelante, la mejor vista del concierto", 
        2350,
        20
        );
    
    Usuario user = new Usuario(
        null, 
        null, 
        0, 
        null, 
        false
        );
    
        public void colocarDatos(String nombre, String dpi, int cantidadBoletos, Float presupuestoMax){
            user.setNombre(nombre);
            user.setDpi(dpi);
            user.setCantidadBoletos(cantidadBoletos);
            user.setPresupuestoMax(presupuestoMax);
        }
        // Hacer la suma de tickets y los números aleatorios
    public int sumarTickets(){
        return (numeroTicket + numeroAleatorioA + numeroAleatorioB);
    }

    // Validar que la suma sea apta para la compra, es decir, que la suma de los números sea par
    public void aptoParaCompra(){
        if(sumarTickets() % 2 == 0){
            System.out.println("Es apto para comprar");
            user.setAptoParaComprar(true);
            // indice para sacar de manera aleatoria la localidad que le toque al usuario
            int indice = random.nextInt(3);
            if(indice == 0){
                System.out.println("La localidad que le toca es la localidad 1: " + localidad1.getDescripcion());
                if(user.presupuestoMax > localidad1.getPrecio()){
                    int cantidad = localidad1.getboletosDisponibles() - user.getCantidadBoletos();
                    localidad1.setboletosDisponibles(cantidad);
                    System.out.println("Comprado exitosamente");
                } else {System.out.println("Parece que no tiene el presupuesto suficiente, inténtelo de nuevo");}
            }
            if(indice == 1){
                System.out.println("La localidad que le toca es la localidad 5: " + localidad5.getDescripcion());
                if(user.presupuestoMax > localidad5.getPrecio()){
                    int cantidad = localidad5.getboletosDisponibles() - user.getCantidadBoletos();
                    localidad5.setboletosDisponibles(cantidad);
                    System.out.println("Comprado exitosamente");
                } else {System.out.println("Parece que no tiene el presupuesto suficiente, inténtelo de nuevo");}
            }
            if(indice == 2){
                System.out.println("La localidad que le toca es la localidad 10: " + localidad10.getDescripcion());
                if(user.presupuestoMax > localidad10.getPrecio()){
                    int cantidad = localidad10.getboletosDisponibles() - user.getCantidadBoletos();
                    localidad10.setboletosDisponibles(cantidad);
                    System.out.println("Comprado exitosamente");
                } else {System.out.println("Parece que no tiene el presupuesto suficiente, inténtelo de nuevo");}
            }
        } else {
            System.out.println("No es apto para comprar, intente más tarde");
        }
    }
}
