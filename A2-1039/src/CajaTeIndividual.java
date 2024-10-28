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

    public String toString() {
        return "Caja de " + tipo ;
    }
}
