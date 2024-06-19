package production.com.santanderAcademy;

public class Iphone extends AparelhoTelefonico {
    private String modelo;

    public void IPhone (String modelo) {
        this.modelo = modelo;
    }

    public void metodoEspecificoIPhone() {
    }

    @Override
    public boolean redeMovelDisponivel () {
        return false;
    }

    @Override
    public void ligar () {

    }

    @Override
    public void atender () {

    }

    @Override
    public void iniciarCorreioVoz () {

    }
}
