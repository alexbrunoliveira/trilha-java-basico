package dispositivo.mobile;

import dispositivo.internet.NavegadorWeb;
import  dispositivo.musica.ReproduzirMusica;
import dispositivo.smartPhone.AparelhoTelefonico;



public class Iphone implements AparelhoTelefonico, NavegadorWeb, ReproduzirMusica {

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }
    
    
    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo pagina do navegador...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void fecharAbaNavegador() {
        System.out.println("Fechando aba do navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página");
    }

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

