public class CajaTeIndividual implements CajaTe{
    private String tipo;
    private int sobres;

    public CajaTeIndividual(String tipo, int sobres){
        this.sobres = sobres;
        this.tipo = tipo;
    }

    @Override
    public int calcularSobres() {
        return sobres;
    }

    @Override
    public void notificar() {
        // No notificación para las cajas individuales
        System.out.println("No se envía notificación para cajas individuales.");
    }

    public String toString() {
        return "Caja de " + tipo ;
    }
}
