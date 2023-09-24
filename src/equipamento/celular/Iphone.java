package equipamento.celular;

import equipamento.internet.NavegadorNaInternet;
import equipamento.musica.ReprodutorMusical;
import equipamento.telefonia.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {


    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCcorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void vivaVoz() {
        System.out.println("Viva voz ativado");
    }

    @Override
    public void silenciar() {
        System.out.println("Chamada silenciada");
    }

    @Override
    public void colocarEmEspera() {
        System.out.println("Chamada em espera...");
    }

    @Override
    public void adicionarChamada() {
        System.out.println("Adicionando outro contato a chamada");
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
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        System.out.println("Parando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando nova música");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume");
    }
}
