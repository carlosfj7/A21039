public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té");

        CajaTeGrande paqueteCliente1 = new CajaTeGrande("Paquete para Cliente 1");
        paqueteCliente1.añadirCaja(new CajaTeIndividual("Te Blanco", 60));
        paqueteCliente1.añadirCaja(new CajaTeIndividual("Te Blanco", 60));
        paqueteCliente1.añadirCaja(new CajaTeIndividual("Te Verde", 24));


        CajaTeGrande paqueteCliente2 = new CajaTeGrande("Paquete para Cliente 2");
        paqueteCliente2.añadirCaja(new CajaTeIndividual("Te Verde", 24));
        paqueteCliente2.añadirCaja(new CajaTeIndividual("Te Verde", 24));
        paqueteCliente2.añadirCaja(new CajaTeIndividual("Te Blanco", 60));

        GestorCajasTe envio = new GestorCajasTe();
        envio.añadirPaquete(paqueteCliente1);
        envio.añadirPaquete(paqueteCliente2);
        envio.calcularEnvio();
    }


}
