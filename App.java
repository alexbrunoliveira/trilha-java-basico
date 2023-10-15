package dispositivo;

import dispositivo.mobile.Iphone;
import dispositivo.musica.Ipod;

import dispositivo.internet.NavegadorWeb;
import  dispositivo.musica.ReproduzirMusica;
import dispositivo.smartPhone.AparelhoTelefonico;

public class App {

 public static void main(String[] args){
  
  NavegadorWeb iphone11 = new Iphone();
  
  iphone11.exibirPagina();
  iphone11.adicionarNovaAba();
  iphone11.fecharPagina();
  iphone11.atualizarPagina();

  
  
  ReproduzirMusica iphoneXr = new Ipod();
  
  System.out.println();
  iphoneXr.reproduzir();
  iphoneXr.selecionar();
  iphoneXr.pausar();
  }   
}
