public class Ticket {
    // Sus propiedades
    private int numeroTicket, numeroAleatorioA, numeroAleatorioB;

    // Constructores
    public Ticket(int numeroTicket, int numeroAleatorioA, int numeroAleatorioB) {
        this.numeroTicket = numeroTicket;
        this.numeroAleatorioA = numeroAleatorioA;
        this.numeroAleatorioB = numeroAleatorioB;
    }

    Ticket(){
        
    }

    // Getters y setters
    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getNumeroAleatorioA() {
        return numeroAleatorioA;
    }

    public void setNumeroAleatorioA(int numeroAleatorioA) {
        this.numeroAleatorioA = numeroAleatorioA;
    }

    public int getNumeroAleatorioB() {
        return numeroAleatorioB;
    }

    public void setNumeroAleatorioB(int numeroAleatorioB) {
        this.numeroAleatorioB = numeroAleatorioB;
    }


}
