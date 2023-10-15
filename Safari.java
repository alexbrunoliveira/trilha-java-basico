package dispositivo.internet;

public class Safari implements NavegadorWeb {

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo pagina do navegador safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba safari");
    }

    @Override
    public void fecharAbaNavegador() {
        System.out.println("Fechando aba do navegador safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no safari");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página do safari");
    }
}

