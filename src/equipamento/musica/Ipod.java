package equipamento.musica;

public class Ipod implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando música no ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no ipod");
    }

    @Override
    public void parar() {
        System.out.println("Parando música no ipod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando nova música no ipod");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume do ipod");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume do ipod");
    }
}
