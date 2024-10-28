import java.util.ArrayList;
import java.util.List;

public class CajaTeGrande implements CajaTe {
    private String nombre;
    private List<CajaTe> cajasIndividuales = new ArrayList<>();

    public CajaTeGrande(String nombre) {
        this.nombre = nombre;
    }

    public void añadirCaja(CajaTe caja) {
        cajasIndividuales.add(caja);
        System.out.println("Añado una caja de " + caja.toString());
    }
    @Override
    public int calcularSobres() {
        int total = 0;

        for (CajaTe cajaTe : cajasIndividuales){
            total += cajaTe.calcularSobres();
        }

        return total;
    }

    @Override
    public String toString() {
        return nombre + " (" + calcularSobres();
    }
}
