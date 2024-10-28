public class GestorCajasTe {
    private CajaTeGrande envio = new CajaTeGrande("Envio a Asia");

    public void añadirPaquete(CajaTe paquete) {
        envio.añadirCaja(paquete);
        System.out.println("Este paquete consta de " + paquete.calcularSobres() + " unidades");
    }
    public void calcularEnvio() {
        int totalEnvio = envio.calcularSobres();
        System.out.println("El envío a Asia contiene " + totalEnvio + " unidades de té");
    }

    public void notificarEnvio() {
        envio.notificar();
    }
}
