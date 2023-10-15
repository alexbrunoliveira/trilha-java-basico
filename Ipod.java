package dispositivo.musica;


public class Ipod implements ReproduzirMusica {
    @Override
    public void reproduzir() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando nova música");
    }

    
}



