public class Localidad {
    // Propiedades
    private String descripcion;
    private int precio, boletosDisponibles;

    Localidad(){
        
    }
    
    // Constructores
    public Localidad(String descripcion, int precio, int boletosDisponibles) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.boletosDisponibles = boletosDisponibles;
    }

    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getboletosDisponibles() {
        return boletosDisponibles;
    }
    public void setboletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    }


}
