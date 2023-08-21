public class Usuario {
    // Propiedades
    String nombre;
    String dpi;
    int cantidadBoletos;
    Float presupuestoMax;
    boolean aptoParaComprar;
    
    // Constructores
    public Usuario(String nombre, String dpi, int cantidadBoletos, Float presupuestoMax, boolean aptoParaComprar) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.cantidadBoletos = cantidadBoletos;
        this.presupuestoMax = presupuestoMax;
        this.aptoParaComprar = aptoParaComprar;
    }

    Usuario(){

    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDpi() {
        return dpi;
    }
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }
    public Float getPresupuestoMax() {
        return presupuestoMax;
    }
    public void setPresupuestoMax(Float presupuestoMax) {
        this.presupuestoMax = presupuestoMax;
    }
    public boolean isAptoParaComprar() {
        return aptoParaComprar;
    }
    public void setAptoParaComprar(boolean aptoParaComprar) {
        this.aptoParaComprar = aptoParaComprar;
    }
}
