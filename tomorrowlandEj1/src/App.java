public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        // Ciclo for para hacer las 60 ventas a los distintos usuarios
         for (int i = 0; i < 60; i++) {
            System.out.println("Le damos la bienvenida. Por favor ingresar  nombre, dpi, cantidad de boletos a comprar y presupuesto maximo.");
            vista.ingresoDatos();
            vista.mostrarEsApto();
        }
    }
}
