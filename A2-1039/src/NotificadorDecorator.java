public class NotificadorDecorator implements Notifacador{

    protected CajaTe cajaTe;

    public NotificadorDecorator(CajaTe cajaDecorada) {
        this.cajaTe = cajaDecorada;
    }
    @Override
    public int calcularSobres() {
        return cajaTe.calcularSobres();
    }

    @Override
    public void notificar() {
        cajaTe.notificar();
    }
}
