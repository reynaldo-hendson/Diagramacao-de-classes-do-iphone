package testes;

import equipamento.celular.Iphone;
import equipamento.internet.NavegadorNaInternet;
import equipamento.musica.Ipod;
import equipamento.musica.ReprodutorMusical;

public class Aparelho {
    public static void main(String[] args) {
        ReprodutorMusical iphone10 = new Iphone();

        iphone10.tocar();
        iphone10.selecionarMusica();
        iphone10.aumentarVolume();
        iphone10.aumentarVolume();
        iphone10.aumentarVolume();
        iphone10.parar();

        NavegadorNaInternet iphone11 = new Iphone();

        iphone11.exibirPagina();
        iphone11.adicionarNovaAba();
        iphone11.atualizarPagina();
        iphone11.fecharAbaNavegador();
        iphone11.fecharPagina();

        ReprodutorMusical ipod = new Ipod();
        ipod.tocar();
        ipod.selecionarMusica();
        ipod.aumentarVolume();
        ipod.diminuirVolume();
        ipod.pausar();
        ipod.parar();

    }
}