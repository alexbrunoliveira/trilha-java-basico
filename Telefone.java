package dispositivo.smartPhone;

public class Telefone implements AparelhoTelefonico {

    
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação do telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do telefone");
    }

  }


