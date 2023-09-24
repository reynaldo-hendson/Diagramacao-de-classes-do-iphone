package equipamento.telefonia;

public class Telefone implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação do telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no telefone");
    }

    @Override
    public void iniciarCcorreioDeVoz() {
        System.out.println("Iniciando correio de voz do telefone");
    }

    @Override
    public void vivaVoz() {
        System.out.println("Viva voz ativado no telefone");
    }

    @Override
    public void silenciar() {
        System.out.println("Chamada silenciada no telefone");
    }

    @Override
    public void colocarEmEspera() {
        System.out.println("Chamada em espera...");
    }

    @Override
    public void adicionarChamada() {
        System.out.println("Adicionando outro contato a chamada no telefone");
    }
}
