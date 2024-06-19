package production.com.santanderAcademy;

public abstract class AparelhoTelefonico {
    private Contato[] contatos;

    public abstract boolean redeMovelDisponivel();

    public abstract void ligar();

    public abstract void atender();

    public abstract void iniciarCorreioVoz();

    public void metodoComum() {

    }
}
